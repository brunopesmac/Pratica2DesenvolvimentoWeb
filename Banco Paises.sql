SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';
CREATE SCHEMA IF NOT EXISTS `Paises`;
USE `Paises` ;

CREATE TABLE IF NOT EXISTS `Pais`(
`id` int(11) unsigned not null auto_increment,
`nome` varchar(100) not null unique,
`populacao`bigint not null,
`area`double not null,
primary key (`id`))
engine = InnoDB
default character set= utf8;
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
select * from pais;
delete from pais where id="13";