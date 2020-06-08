mkdir -p ~/.docker
> ~/.docker/config.json
echo '{"credsStore": "ecr-login"}' | tee -a ~/.docker/config.json