mkdir -p ~/.docker
> ~/.docker/config.json
echo '{"credsStore": "ecr-login"}' | tee -a ~/.docker/config.json
cat /root/.docker/config.json
echo $PATH
docker-credential-ecr-login -v