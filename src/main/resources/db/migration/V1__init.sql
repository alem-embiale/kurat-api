CREATE TABLE IF NOT EXISTS `admins` (
    id BIGINT(20) NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    email VARCHAR(255),
    PRIMARY KEY (id))
    ENGINE=InnoDB DEFAULT CHARSET=utf8;
