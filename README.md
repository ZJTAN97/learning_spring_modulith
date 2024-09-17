# Using psql
```bash
docker exec -it <container> bash
```

```sql
psql postgresql://myuser@localhost:5432/mydatabase

# See all tables
\d

# Sample Queries
select * from orders;
select * from order_line_items;

```