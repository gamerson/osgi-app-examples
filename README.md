In order to run these apps in Eclipse need latest Bndtools 3.4 DEV build installeble from here:

https://bndtools.ci.cloudbees.com/job/bndtools.master/lastSuccessfulBuild/artifact/build/generated/p2/

You can import the projects in either the Bnd Workspace Model under the `bndtools` folder.

# Bndtools

1. File > Import > Existing projects
2. Point to bndtools subdir
3. import all projects
4. open the add.launch project, right-click add.bndrun > Run as > Bnd OSGi Launcher

# Maven

1. File > import > Maven > Existing maven projects
2. Point to maven subdir
3. Import all projects
4. open the add.launch project, right-click add.bndrun > Run as > Bnd OSGi Launcher
