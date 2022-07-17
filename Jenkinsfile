def gv

pipeline{
	agent any
	parameters {
		string(name: 'VERSION', defaultValue: '', description: '')
		choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
		booleanParam(name: 'executetests', defaultValue:true, description: '')
	}
	stages{
		stage("init"){
			steps{
				script{
					gv=load "script.groovy"
				}
			}
		}
		stage("download code"){
			steps{
				script{
					gv.download()
					
				}}}
		stage("build project"){
			steps{
				script{
					gv.build()
					
				}}}
		stage("deploy to QA"){
			steps{
				script{
					gv.deploy()
				}}}
		
	}
}
