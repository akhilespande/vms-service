A quick demo how to publish a jar package and a release to github

**Steps to release to github:**

In order to get this setup you need clone this repository into your own github account. Then you follow the description here to set your ssh keys up for github.

When this is done We should be able to push new changes using ssh and that's required to push the new release.

1. To create a package of your build : `mvn package`

2. To prepare a build and create a new release tag on github:
`mvn release:prepare`

3. To perform the actual release and get the source, javadoc and jar-with-dependencies:
`mvn release:perform`


**Steps publish package to github:** 

You can configure Apache Maven to publish packages to GitHub Packages and to use packages stored on GitHub Packages as dependencies in a Java project.
1. we need  an access token to publish, install, and delete packages. Follow the description here

2. We need You can authenticate to GitHub Packages with Apache Maven by editing your ~/.m2/settings.xml file to include your personal access token. Create a new ~/.m2/settings.xml file if one doesn't exist.

3. In the servers tag, add a child server tag with an id, replacing USERNAME with your GitHub username, and TOKEN with your personal access token.
   Follow the description here

**Publish the package.**

`$ mvn deploy`