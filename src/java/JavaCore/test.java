package src.java.JavaCore;

interface QueryBuilder {
    QueryBuilder setFrom(String from);
    QueryBuilder setWhere(String where);
    Query getQuery();
}
class SQLQueryBuilder implements QueryBuilder {
    private Query query = new SQLQuery();
    @Override public QueryBuilder setFrom(String from) {
        query.add(from);
        return this;
    }
    @Override public QueryBuilder setWhere(String where) {
        query.add(where);
        return this;
    }
    @Override public Query getQuery() {
        return query;
    }
}

interface Query {
    void add(String s);
    void execute();
}

class SQLQuery implements Query {
    StringBuilder query = new StringBuilder();
    @Override public void add(String part) {
        query.append(" ").append(part);
    }
    @Override public void execute() {
        System.out.printf("Execute \"%s\"%n", query.toString().trim());
    }
}
class QueryBuildDirector {
    public Query build(QueryBuilder builder, String from, String where) {
        return builder.setFrom(from).setWhere(where).getQuery();
    }
}

public class test {
    public static void main(String[] args) {
        System.out.println("--- Builder Pattern ---");
        QueryBuildDirector director = new QueryBuildDirector();
        QueryBuilder builder = new SQLQueryBuilder();
        Query query = director.build(builder, "FROM Student_1", "WHERE code = 04/12/2022");
        query.execute();
    }
}
