CREATE TABLE Client (
    idClient int(11) NOT NULL AUTO_INCREMENT,
    pseudo VARCHAR(64),
    couleur VARCHAR(64),
    PRIMARY KEY (idClient)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Groupe (
    idGroupe int(11) NOT NULL AUTO_INCREMENT,
    numeroTable int(11),
    PRIMARY KEY (idGroupe)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Commande (
    idCommande int(11) NOT NULL AUTO_INCREMENT,
    dateCommande VARCHAR(64),
    PRIMARY KEY (idCommande)
)   DEFAULT CHARSET=utf8;

CREATE TABLE ChoixClient (
    idChoixClient int(11) NOT NULL AUTO_INCREMENT,
    idClient int(11),
    idCommande int(11),
    PRIMARY KEY (idChoixClient)
)   DEFAULT CHARSET=utf8;

CREATE TABLE ChoixClientTapas (
    idChoixClientTapas int(11) NOT NULL AUTO_INCREMENT,
    idTapas int(11),
    idChoixClient int(11),
    PRIMARY KEY (idChoixClientTapas)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Tapas (
    idTapas int(11) NOT NULL AUTO_INCREMENT,
    nomTapas VARCHAR(64),
    PRIMARY KEY (idTapas)
)   DEFAULT CHARSET=utf8;

CREATE TABLE CategorieTapas (
    idCategorieTapas int(11) NOT NULL AUTO_INCREMENT,
    idTapas int(11),
    idCategorie int(11),
    PRIMARY KEY (idCategorieTapas)
)   DEFAULT CHARSET=utf8;

CREATE TABLE Categorie (
    idCategorie int(11) NOT NULL AUTO_INCREMENT,
    libelle VARCHAR(64),
    PRIMARY KEY (idCategorie)
)   DEFAULT CHARSET=utf8;

/*ALTER TABLE Exercice   
ADD CONSTRAINT Exercice_idTP
FOREIGN KEY (idTP)
REFERENCES TP(idTP);*/
