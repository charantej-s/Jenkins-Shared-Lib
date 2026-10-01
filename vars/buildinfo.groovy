def call(){
    echo "Job Name is :${env.JOB_NAME}"
    echo "Build Number is :${env.BUILD_NUMBER}"
    echo "Workspace is :${env.WORKSPACE}"
}