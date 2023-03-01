package com.apiproject.backend.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories
public class ElasticConfig extends ElasticsearchConfiguration {
    @Value("${ELASTICSEARCH_HOST:localhost}")
        private String host;
        @Value("${ELASTICSEARCH_port:9200}")
        private String port;
    @Override
    public ClientConfiguration clientConfiguration() {
        // TODO Auto-generated method stub
         
        return ClientConfiguration.builder().connectedTo(host+":"+port).build();
    }
    
}
