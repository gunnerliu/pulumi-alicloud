// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dds.outputs;

import com.pulumi.alicloud.dds.outputs.GetMongoInstancesInstanceMongo;
import com.pulumi.alicloud.dds.outputs.GetMongoInstancesInstanceShard;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetMongoInstancesInstance {
    private final String availabilityZone;
    private final String chargeType;
    private final String creationTime;
    private final String engine;
    private final String engineVersion;
    private final String expirationTime;
    private final String id;
    private final String instanceClass;
    private final String instanceType;
    private final String lockMode;
    private final List<GetMongoInstancesInstanceMongo> mongos;
    private final String name;
    private final String networkType;
    private final String regionId;
    private final String replication;
    private final List<GetMongoInstancesInstanceShard> shards;
    private final String status;
    private final Integer storage;
    private final Map<String,Object> tags;

    @CustomType.Constructor
    private GetMongoInstancesInstance(
        @CustomType.Parameter("availabilityZone") String availabilityZone,
        @CustomType.Parameter("chargeType") String chargeType,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("engine") String engine,
        @CustomType.Parameter("engineVersion") String engineVersion,
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceClass") String instanceClass,
        @CustomType.Parameter("instanceType") String instanceType,
        @CustomType.Parameter("lockMode") String lockMode,
        @CustomType.Parameter("mongos") List<GetMongoInstancesInstanceMongo> mongos,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("networkType") String networkType,
        @CustomType.Parameter("regionId") String regionId,
        @CustomType.Parameter("replication") String replication,
        @CustomType.Parameter("shards") List<GetMongoInstancesInstanceShard> shards,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("storage") Integer storage,
        @CustomType.Parameter("tags") Map<String,Object> tags) {
        this.availabilityZone = availabilityZone;
        this.chargeType = chargeType;
        this.creationTime = creationTime;
        this.engine = engine;
        this.engineVersion = engineVersion;
        this.expirationTime = expirationTime;
        this.id = id;
        this.instanceClass = instanceClass;
        this.instanceType = instanceType;
        this.lockMode = lockMode;
        this.mongos = mongos;
        this.name = name;
        this.networkType = networkType;
        this.regionId = regionId;
        this.replication = replication;
        this.shards = shards;
        this.status = status;
        this.storage = storage;
        this.tags = tags;
    }

    public String availabilityZone() {
        return this.availabilityZone;
    }
    public String chargeType() {
        return this.chargeType;
    }
    public String creationTime() {
        return this.creationTime;
    }
    public String engine() {
        return this.engine;
    }
    public String engineVersion() {
        return this.engineVersion;
    }
    public String expirationTime() {
        return this.expirationTime;
    }
    public String id() {
        return this.id;
    }
    public String instanceClass() {
        return this.instanceClass;
    }
    public String instanceType() {
        return this.instanceType;
    }
    public String lockMode() {
        return this.lockMode;
    }
    public List<GetMongoInstancesInstanceMongo> mongos() {
        return this.mongos;
    }
    public String name() {
        return this.name;
    }
    public String networkType() {
        return this.networkType;
    }
    public String regionId() {
        return this.regionId;
    }
    public String replication() {
        return this.replication;
    }
    public List<GetMongoInstancesInstanceShard> shards() {
        return this.shards;
    }
    public String status() {
        return this.status;
    }
    public Integer storage() {
        return this.storage;
    }
    public Map<String,Object> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoInstancesInstance defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityZone;
        private String chargeType;
        private String creationTime;
        private String engine;
        private String engineVersion;
        private String expirationTime;
        private String id;
        private String instanceClass;
        private String instanceType;
        private String lockMode;
        private List<GetMongoInstancesInstanceMongo> mongos;
        private String name;
        private String networkType;
        private String regionId;
        private String replication;
        private List<GetMongoInstancesInstanceShard> shards;
        private String status;
        private Integer storage;
        private Map<String,Object> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoInstancesInstance defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.chargeType = defaults.chargeType;
    	      this.creationTime = defaults.creationTime;
    	      this.engine = defaults.engine;
    	      this.engineVersion = defaults.engineVersion;
    	      this.expirationTime = defaults.expirationTime;
    	      this.id = defaults.id;
    	      this.instanceClass = defaults.instanceClass;
    	      this.instanceType = defaults.instanceType;
    	      this.lockMode = defaults.lockMode;
    	      this.mongos = defaults.mongos;
    	      this.name = defaults.name;
    	      this.networkType = defaults.networkType;
    	      this.regionId = defaults.regionId;
    	      this.replication = defaults.replication;
    	      this.shards = defaults.shards;
    	      this.status = defaults.status;
    	      this.storage = defaults.storage;
    	      this.tags = defaults.tags;
        }

        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        public Builder chargeType(String chargeType) {
            this.chargeType = Objects.requireNonNull(chargeType);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder engine(String engine) {
            this.engine = Objects.requireNonNull(engine);
            return this;
        }
        public Builder engineVersion(String engineVersion) {
            this.engineVersion = Objects.requireNonNull(engineVersion);
            return this;
        }
        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceClass(String instanceClass) {
            this.instanceClass = Objects.requireNonNull(instanceClass);
            return this;
        }
        public Builder instanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }
        public Builder lockMode(String lockMode) {
            this.lockMode = Objects.requireNonNull(lockMode);
            return this;
        }
        public Builder mongos(List<GetMongoInstancesInstanceMongo> mongos) {
            this.mongos = Objects.requireNonNull(mongos);
            return this;
        }
        public Builder mongos(GetMongoInstancesInstanceMongo... mongos) {
            return mongos(List.of(mongos));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder networkType(String networkType) {
            this.networkType = Objects.requireNonNull(networkType);
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }
        public Builder replication(String replication) {
            this.replication = Objects.requireNonNull(replication);
            return this;
        }
        public Builder shards(List<GetMongoInstancesInstanceShard> shards) {
            this.shards = Objects.requireNonNull(shards);
            return this;
        }
        public Builder shards(GetMongoInstancesInstanceShard... shards) {
            return shards(List.of(shards));
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder storage(Integer storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }
        public Builder tags(Map<String,Object> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }        public GetMongoInstancesInstance build() {
            return new GetMongoInstancesInstance(availabilityZone, chargeType, creationTime, engine, engineVersion, expirationTime, id, instanceClass, instanceType, lockMode, mongos, name, networkType, regionId, replication, shards, status, storage, tags);
        }
    }
}
