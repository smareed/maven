pipeline{
	agent any
	stages{
		stage("download code"){
			steps{
				git 'https://github.com/smareed/maven.git'
			}}
		stage("build project"){
			steps{
				sh 'mvn clean install'
			}}
		stage("deploy to QA"){
			steps{
				sh 'scp webapp/target/webapp.war root@172.31.32.5:/var/lib/tomcat9/webapps/qaenv.war'
			}}
	}
}
