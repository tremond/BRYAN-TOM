CREATE TABLE Client (
    idClient int(11) NOT NULL AUTO_INCREMENT,
    pseudo VARCHAR(64),
    couleur VARCHAR(64),
	idGroupe int(11),
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
	idGroupe int(11),
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

ALTER TABLE ChoixClient
ADD CONSTRAINT ChoixClientClient
FOREIGN KEY (idClient)
REFERENCES Client(idClient);

ALTER TABLE ChoixClient
ADD CONSTRAINT ChoixClientCommande
FOREIGN KEY (idCommande)
REFERENCES Commande(idCommande);

ALTER TABLE Commande
ADD CONSTRAINT CommandeGroupe
FOREIGN KEY (idGroupe)
REFERENCES Groupe(idGroupe);

ALTER TABLE Client
ADD CONSTRAINT ClientGroupe
FOREIGN KEY (idGroupe)
REFERENCES Groupe(idGroupe);

ALTER TABLE ChoixClientTapas 
ADD CONSTRAINT ChoixCliTap
FOREIGN KEY (idTapas)
REFERENCES Tapas(idTapas);

ALTER TABLE ChoixClientTapas
ADD CONSTRAINT ChoixTapCli
FOREIGN KEY (idChoixClient)
REFERENCES ChoixClient(idChoixClient);

ALTER TABLE CategorieTapas
ADD CONSTRAINT ChoixCatTap
FOREIGN KEY (idCategorie)
REFERENCES Categorie(idCategorie);

ALTER TABLE CategorieTapas
ADD CONSTRAINT ChoixTapCat
FOREIGN KEY (idTapas)
REFERENCES Tapas(idTapas);


insert into Client (pseudo, couleur, idGroupe) values ("Fabrice", "rouge", 1);
insert into Client (pseudo, couleur, idGroupe) values ("Elliot", "jaune", 1);
insert into Client (pseudo, couleur, idGroupe) values ("Jean-Patrick", "vert", 2);
insert into Client (pseudo, couleur, idGroupe) values ("Jean-Phillipe", "orange", 2);
insert into Client (pseudo, couleur, idGroupe) values ("Jean-pol", "violet", 2);

insert into Groupe (numeroTable) values (1);
insert into Groupe (numeroTable) values (2);