def gv=load "script.groovy"
pipeline{
	agent any
	parameters{
		string(name: 'VERSION', defaultvalue: '', description: '')
		choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
		booleanparam(name: 'executetests', defaultvalue:true, description: '')
	stages{
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
}
