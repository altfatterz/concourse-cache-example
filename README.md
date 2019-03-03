```bash
fly -t ci set-pipeline -p cache-demo -c ci/pipeline.yml 
fly -t ci unpause-pipeline -p cache-demo
```