#Prerequisites Local MongoDB
###The following Items will be need to be installed

-Docker
https://www.docker.com/products/docker-desktop

-mongodb client(Compass)
https://www.mongodb.com/products/compass

...console
#verify that Docker is installed
$ docker --version
...

###Run MongoDB

...console
$ docker run --name mongodb -d

#verify that mongodb is set up
$ docker ps -a
...

###connect mongodb to mongodb client
Hostname=localhost
port=27017
