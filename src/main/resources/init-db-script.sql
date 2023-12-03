delimiter $$

CREATE DATABASE `multi-tenant` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */$$

CREATE TABLE `multi-tenant`.`person` (
  `person_id` INT NOT NULL,
  `tenant` VARCHAR(45) NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`person_id`));

INSERT INTO `multi-tenant`.`person` (`person_id`, `tenant`, `name`) VALUES ('1', 'A', 'A1');
INSERT INTO `multi-tenant`.`person` (`person_id`, `tenant`, `name`) VALUES ('2', 'A', 'A2');
INSERT INTO `multi-tenant`.`person` (`person_id`, `tenant`, `name`) VALUES ('3', 'B', 'B1');
INSERT INTO `multi-tenant`.`person` (`person_id`, `tenant`, `name`) VALUES ('4', 'B', 'B2');
