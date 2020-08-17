package org.hswebframework.ezorm.rdb.metadata.parser;

import org.hswebframework.ezorm.core.meta.ObjectMetadataParser;
import org.hswebframework.ezorm.core.meta.ObjectType;
import org.hswebframework.ezorm.rdb.metadata.RDBObjectType;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface TableMetadataParser extends ObjectMetadataParser {

    String id = "tableMetadataParser";

    @Override
    default String getId() {
        return id;
    }

    @Override
    default String getName() {
        return "表结构解析器";
    }

    @Override
    default ObjectType getObjectType() {
        return RDBObjectType.table;
    }

    List<String> parseAllTableName();

    Flux<String> parseAllTableNameReactive();

    boolean tableExists(String name);

    Mono<Boolean> tableExistsReactive(String name);
}
