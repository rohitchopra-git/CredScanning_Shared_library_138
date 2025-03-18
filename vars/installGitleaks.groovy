def call() {
    sh '''
        wget https://github.com/gitleaks/gitleaks/releases/download/v8.24.0/gitleaks_8.24.0_linux_x64.tar.gz
        tar -xzvf gitleaks_8.24.0_linux_x64.tar.gz
        chmod +x gitleaks
        sudo mv gitleaks /usr/local/bin/
    '''
}
