DROP TABLE IF EXISTS library;



CREATE TABLE `author` (
  `id` INT NOT NULL AUTO_INCREMENT,
 `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NULL,
  `region` VARCHAR(20) NULL,
  PRIMARY KEY (`id`));


CREATE TABLE `book` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `book_name` VARCHAR(100) NOT NULL,
  `genre` VARCHAR(45) NULL,
  `author_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `author_fk` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`));
  
  
INSERT INTO author (first_name, last_name, region) VALUES
  ('sedny', 'sheldon', 'usa'),
  ('agatha', 'christy', 'uk'),
  ('chetan', 'bhagat', 'india');
  

INSERT INTO book (book_name, genre, author_id) VALUES
  ('sky is falling', 'thriller', '1'),
  ('and then there were none', 'thiller', '2'),
  ('three mistakes', 'fiction', '3');
  
 