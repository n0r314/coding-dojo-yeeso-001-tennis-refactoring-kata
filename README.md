
# Le Scénario

Imaginez que vous travaillez pour une société de conseil et que l'un de vos collègues a réalisé une prestation pour la Tennis Society. Le contrat prévoit 10 heures de travail facturables et votre collègue y a consacré 8,5 heures. Malheureusement, il est tombé malade. Il affirme avoir terminé le travail et que tous les tests passent avec succès. Votre responsable vous demande de prendre le relais. Elle souhaite que vous passiez environ une heure sur le code afin de pouvoir facturer la totalité des 10 heures au client. Elle vous demande de nettoyer un peu le code et éventuellement de prendre des notes afin de faire un retour à votre collègue sur ses choix de conception. Vous devez également vous préparer à expliquer à votre responsable la valeur de ce travail de refactorisation, au-delà de la simple heure facturable supplémentaire.

La suite de tests fournie pour la classe `TennisGameImpl` est complète et rapide à exécuter. Vous ne devriez pas avoir besoin de modifier les tests, mais seulement de les exécuter fréquemment au fur et à mesure de votre refactorisation.

Si vous aimez ce Kata, vous pourriez être intéressé(e) par [les livres d'Emily Bache](https://leanpub.com/u/emilybache) et le site [SammanCoaching.org](https://sammancoaching.org).

## Description du Kata

Le tennis possède un système de comptage des points assez particulier, et pour les personnes qui découvrent ce sport, il peut être un peu difficile à suivre. La Tennis Society vous a engagé(e) pour concevoir un tableau d'affichage permettant d'afficher le score en cours pendant les jeux de tennis.

Vous pouvez en savoir plus sur le décompte des points au tennis sur Wikipédia, résumé ci-dessous :

    Un jeu est remporté par le premier joueur ayant marqué au moins quatre points au total et au moins deux points de plus que son adversaire.
    Le score au cours d'un jeu est décrit d'une manière propre au tennis : les scores de zéro à trois points sont décrits respectivement par « Zéro », « Quinze », « Trente » et « Quarante ».
    Si au moins trois points ont été marqués par chaque joueur et que les scores sont égaux, le score est « Égalité ».
    Si au moins trois points ont été marqués par chaque joueur et qu'un joueur a un point de plus que son adversaire, le score du jeu est « Avantage » pour le joueur en tête.

Vous devez uniquement indiquer le score du jeu en cours. Les sets et les matches sont hors périmètre.

[Source en anglais](https://sammancoaching.org/kata_descriptions/tennis.html).

## Questions de discussion

* Qu'avez-vous ressenti en travaillant avec des tests aussi rapides et complets ?
* Avez-vous commis des erreurs lors de la refactorisation qui ont été détectées par les tests ?
* Si vous avez utilisé un outil pour enregistrer vos passages de tests, analysez-le. Auriez-vous pu faire des étapes plus petites ? Commettre moins d'erreurs de refactorisation ?
* Avez-vous déjà fait des erreurs de refactorisation et dû annuler vos changements ? Qu'avez-vous ressenti à l'idée d'abandonner du code ?
* Que diriez-vous à votre collègue s'il avait écrit ce code ?
* Que diriez-vous à votre responsable au sujet de la valeur de ce travail de refactorisation ? Y avait-il d'autres raisons de le faire au-delà de l'heure facturable supplémentaire ?

## Pratique de lecture de code

Testez vos compétences de lecture de code. Voici une description de l'exercice : [Scanning for Code Smells](https://sammancoaching.org/exercises/code_reading.html).
