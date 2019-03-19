-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 19 Mars 2019 à 21:16
-- Version du serveur :  5.6.17
-- Version de PHP :  5.5.12

SET FOREIGN_KEY_CHECKS=0;
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `poussin-import`
--

-- --------------------------------------------------------

--
-- Structure de la table `evolution`
--

CREATE TABLE IF NOT EXISTS `evolution` (
  `id` bigint(20) NOT NULL,
  `nbr_oeuf` int(11) NOT NULL,
  `poid` double NOT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `semaine` int(11) NOT NULL,
  `importation` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKo5xd6uf7sia8ax8lh2fkcgfau` (`importation`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `evolution`
--

INSERT INTO `evolution` (`id`, `nbr_oeuf`, `poid`, `reference`, `semaine`, `importation`) VALUES
(143, 30, 3.3, 'E7', 7, 136),
(142, 21, 3.1, 'E6', 6, 136),
(141, 22, 3.09, 'E5', 5, 136),
(140, 24, 3.01, 'E4', 4, 136),
(139, 20, 2.3, 'E3', 3, 136),
(138, 23, 2.2, 'E2', 2, 136),
(137, 22, 1.9, 'E1', 1, 136),
(145, 20, 1.8, 'E8', 1, 144),
(146, 12, 2, 'E9', 2, 144),
(147, 22, 2.1, 'E10', 3, 144),
(148, 34, 2.09, 'E11', 4, 144),
(149, 22, 3, 'E12', 5, 144),
(150, 20, 3.11, 'E13', 6, 144),
(151, 19, 4, 'E14', 7, 144),
(153, 16, 1.09, 'E15', 1, 152),
(154, 20, 1.3, 'E16', 2, 152),
(155, 29, 1.5, 'E17', 3, 152),
(156, 24, 1.9, 'E18', 4, 152),
(157, 30, 2.1, 'E19', 5, 152),
(158, 39, 2.9, 'E20', 6, 152),
(159, 30, 3, 'E21', 7, 152),
(161, 20, 1.3, 'E22', 1, 160),
(162, 29, 2, 'E23', 2, 160),
(163, 30, 1.9, 'E24', 3, 160),
(164, 26, 2.2, 'E25', 4, 160),
(165, 33, 2.1, 'E26', 5, 160),
(166, 38, 2.9, 'E27', 6, 160),
(167, 40, 3.5, 'E28', 7, 160),
(169, 10, 1.3, 'E29', 1, 168),
(170, 19, 1.5, 'E30', 2, 168),
(171, 20, 1.9, 'E31', 3, 168),
(172, 26, 2.2, 'E32', 4, 168),
(173, 23, 2.1, 'E33', 5, 168),
(174, 28, 2.7, 'E34', 6, 168),
(175, 10, 2.5, 'E35', 7, 168);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

CREATE TABLE IF NOT EXISTS `fournisseur` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `num_tel` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `reference` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `fournisseur`
--

INSERT INTO `fournisseur` (`id`, `adresse`, `nom`, `num_tel`, `prenom`, `reference`) VALUES
(1, 'Marrakech', 'Hamidi', '0657894567', 'Anas', 'F1'),
(2, 'Casablanca', 'Slaoui', '0645342789', 'Atif', 'F2'),
(3, 'Tahnaout', 'Hilali', '0654673856', 'Samir', 'F3'),
(4, 'Marrakech', 'Alami', '0654378926', 'Ali', 'F4'),
(5, 'Fes', 'Nizar', '0654378924', 'Younes', 'F5');

-- --------------------------------------------------------

--
-- Structure de la table `hibernate_sequence`
--

CREATE TABLE IF NOT EXISTS `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(176),
(176),
(176);

-- --------------------------------------------------------

--
-- Structure de la table `import`
--

CREATE TABLE IF NOT EXISTS `import` (
  `id` bigint(20) NOT NULL,
  `nbr_female` int(11) NOT NULL,
  `nbr_male` int(11) NOT NULL,
  `nbr_total` int(11) NOT NULL,
  `prix_female` double NOT NULL,
  `prix_male` double NOT NULL,
  `prix_total` double NOT NULL,
  `reference` varchar(255) DEFAULT NULL,
  `fournisseur` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbv8a9vb4tq30gcrex55u9ikt6` (`fournisseur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Contenu de la table `import`
--

INSERT INTO `import` (`id`, `nbr_female`, `nbr_male`, `nbr_total`, `prix_female`, `prix_male`, `prix_total`, `reference`, `fournisseur`) VALUES
(136, 400, 330, 730, 24, 23, 17190, 'I1', 1),
(144, 100, 110, 210, 14, 13, 2830, 'I2', 2),
(152, 300, 200, 500, 30, 30, 15000, 'I3', 3),
(160, 500, 320, 820, 70, 40, 47800, 'I4', 4),
(168, 270, 260, 530, 43, 39, 21750, 'I5', 5);
SET FOREIGN_KEY_CHECKS=1;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
