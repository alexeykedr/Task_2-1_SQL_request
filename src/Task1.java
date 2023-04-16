/**
 * SCHEMA:
 * <p>
 * Create table Person (PersonId int, FirstName varchar(255), LastName varchar(255))
 * Create table Address (AddressId int, PersonId int, City varchar(255), State varchar(255))
 * Truncate table Person
 * insert into Person (PersonId, LastName, FirstName) values ('1', 'Wang', 'Allen')
 * Truncate table Address
 * insert into Address (AddressId, PersonId, City, State) values ('1', '2', 'New York City', 'New York')
 * <p>
 * <p>
 * Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:
 * FirstName, LastName, City, State
 */
public class Task1 {
/*
    select p.firstname, p.lastname, a.city, a.state
    from person p
    left join address a on p.personId = a.personId;
*/
}
