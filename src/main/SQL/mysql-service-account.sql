use mydatabase;
CREATE USER 'springframework'@'%' IDENTIFIED BY 'guru';

GRANT SELECT ON mydatabase.* to 'springframework'@'%';
GRANT INSERT ON mydatabase.* to 'springframework'@'%';
GRANT DELETE ON mydatabase.* to 'springframework'@'%';
GRANT UPDATE ON mydatabase.* to 'springframework'@'%';

use qatwo;
CREATE USER 'uqatwo'@'%' IDENTIFIED BY 'qatwo-guru';

GRANT SELECT ON qatwo.* to 'uqatwo'@'%';
GRANT INSERT ON qatwo.* to 'uqatwo'@'%';
GRANT DELETE ON qatwo.* to 'uqatwo'@'%';
GRANT UPDATE ON qatwo.* to 'uqatwo'@'%';