# CustomLintRule (English)
[Lire en Français](https://github.com/KonscienceGit/CustomLintRule/blob/master/README.md#r%C3%A8gle-lint-personnalis%C3%A9e-fran%C3%A7ais)

This custom Lint rule allow for the detection of class declaration in the code source, which the name is 3 or less character short.

## What is this

Since Android Lint isn't fully documented and still in active development, making a custom Lint rule is no easy task. This project is an attempt at documenting how to create a custom Lint rule for Android studio. This project was carried on by me and my buddy [Sameh](https://github.com/Metallink), in the scope of a supervised college assignement.

## Version
This rule works with the current version of Android studio (05/14/2018)
Android Studio 3.1
Android Lint 26.1.2
Java JRE 1.8

## How to use
In order to make this rule work, you'll need to compile it with Android Studio's gradle tool, and put the resulting .jar (found at CustomLintRule/myCheck/build/libs/myCheck.jar) into the custom lint rule folder, located by default at ~/.android/lint/ on Unix, and at the %userprofile% directory on Windows.


For a more in depht coverage of how to create a custom Lint rule, please [read our report](https://github.com/KonscienceGit/CustomLintRule/blob/master/Custom_Lint_Rule.pdf) (in French).

## For more info
For more information about recent changes in Android Lint and how to write custom Lint rules, please see the following links:
* Google group lint-dev: https://groups.google.com/forum/#!forum/lint-dev
* KotlinConf on youtube: https://youtu.be/p8yX5-lPS6o

## Acknowledgements

* Our supervising teacher, [Olivier Le Goaër](http://olegoaer.perso.univ-pau.fr/)
* My partner in this assignement, [Sameh El Awadi](https://github.com/Metallink)


# Règle Lint Personnalisée (Français)
Cette règle Lint personnalisée permet la détection de nom de classes dans le code source, dont le nom fait trois caractères ou moins.

## Qu'est-ce ?

Puisque Android Lint est très peu documenté et toujours en développement, créer une règle Lint personnalisée n'as rien de trivial. Ce projet est une tentative visant à documenter la création d'une règle Lint personnalisée pour Android Studio. Ce projet fut réalisé par moi et mon collègue [Sameh](https://github.com/Metallink), dans le cadre d'un projet tutoré dans notre université.

## Version
Cette règle fonctionne sur la version actuelle d'Android Studio (05/14/2018)
Android Studio 3.1
Android Lint 26.1.2
Java JRE 1.8

## Comment l'utiliser
Pour utilisercette règle, vous devez d'abord la compiler à l'aide de gradle, l'outil de compilation d'Android Studio.
* Une fois dans Android Studio, dans le terminal, entrez les deux commandes suivantes
  * gradlew clean
  * gradlew assemble
* Ensuite rendez vous dans le répertoire CustomLintRule/myCheck/build/libs/myCheck.jar
* déplacer le .jar dans the dossier des règles lint personnalisées, situé pardéfaut à
   * ~/.android/lint/ sous Unix
   * %userprofile% (commande **Run** sous Windows.
   
Pour une couverture plus large du sujet et pour vous aider à créer votre propre règle Lint, [consultez notre rapport](https://github.com/KonscienceGit/CustomLintRule/blob/master/Custom_Lint_Rule.pdf)!

## Pour plus d'informations
Pour plus d'informations concernant les récentes mises à jour et sur comment écrire une règle lint personnalisée, je vous conseille les liens suivants:
* Google group lint-dev: https://groups.google.com/forum/#!forum/lint-dev
* KotlinConf on youtube: https://youtu.be/p8yX5-lPS6o

## Remerciements

* Notre professeur encadrant, [Olivier Le Goaër](http://olegoaer.perso.univ-pau.fr/)
* Mon partenaire dans ce projet, [Sameh El Awadi](https://github.com/Metallink)
