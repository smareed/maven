def download(){
    git 'https://github.com/smareed/maven.git'
}

def build(){
  sh 'mvn clean install'
}

def deploy(){
  sh 'scp webapp/target/webapp.war root@172.31.32.5:/var/lib/tomcat9/webapps/qaenv2.war'
}
  
  
