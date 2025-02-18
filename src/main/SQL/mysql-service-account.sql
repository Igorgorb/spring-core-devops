CREATE USER 'springframework'@'%' IDENTIFIED BY 'guru';

GRANT SELECT ON mydatabase.* to 'springframework'@'%';
GRANT INSERT ON mydatabase.* to 'springframework'@'%';
GRANT DELETE ON mydatabase.* to 'springframework'@'%';
GRANT UPDATE ON mydatabase.* to 'springframework'@'%';