package com.esko.webcenter.query;

import java.sql.SQLException;

import javax.sql.DataSource;

import com.esko.webcenter.query.generated.QProjectGroupMembersDB;
import com.esko.webcenter.query.generated.QProjectUserMembersDB;
import com.esko.webcenter.query.generated.QProjectsDB;
import com.esko.webcenter.query.generated.QUsersDB;
import com.esko.webcenter.query.generated.QUsersInGroupDB;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.querydsl.core.Tuple;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.SQLQuery;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLServer2012Templates;

public class App {

	private static DataSource getDatasource() {
		SQLServerDataSource ds = new SQLServerDataSource();
		ds.setUser("webcenter");
		ds.setPassword("Oicu812!");
		ds.setServerName("localhost\\DEVDB");
		ds.setDatabaseName("WebCenter4_0");

		return ds;
	}

	private static Configuration getConfiguration() {
		return new Configuration(new SQLServer2012Templates());
	}

	private static SQLQueryFactory getFactory() {
		return new SQLQueryFactory(getConfiguration(), getDatasource());
	}

	public static void main(String[] args) throws SQLException {
		test();
	}

	private static void test() {
		SQLQueryFactory factory = getFactory();

		QUsersDB u = QUsersDB.Users;

		SQLQuery<?> query = factory.select(u.userName).from(u).where(u.userName.eq("").or(u.userName.eq("")));

		System.out.println(query);
	}

	private static void complex() {
		SQLQueryFactory factory = getFactory();

		String userID = "00002_0000000201";

		QProjectUserMembersDB pum = QProjectUserMembersDB.ProjectUserMembers;

		SQLQuery<Tuple> query1 = factory.select(pum.projectId, pum.userId).from(pum)
				.where(pum.userId.eq(userID).and(pum.deleted.eq((short) 0)));

		QProjectGroupMembersDB pgm = QProjectGroupMembersDB.ProjectGroupMembers;
		QUsersInGroupDB uig = QUsersInGroupDB.UsersInGroup;
		SQLQuery<Tuple> query2 = factory.select(pgm.projectId, uig.userId).from(pgm).join(uig)
				.on(pgm.groupId.eq(uig.groupId))
				.where(uig.userId.eq(userID).and(pgm.deleted.eq((short) 0)).and(uig.deleted.eq((short) 0)));

		QProjectsDB p = QProjectsDB.Projects;
		QProjectsDB p2 = new QProjectsDB("test");

		SQLQuery<Tuple> query = factory.query().union(pum, query1, query2).select(p.projectName, p2.projectName).join(p)
				.on(p.id.eq(pum.projectId)).join(p2).on(p2.id.eq(pum.userId))
				.where(p.deleted.eq((short) 0).and(p2.deleted.eq((short) 0)));

		System.out.println(query);

		for (Tuple t : query.fetch()) {
			System.out.println(t.get(p.projectName) + "->" + t.get(p2.projectName));
		}
	}
}
