// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mongodb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstancesInstanceShard {
    /**
     * @return Shard instance specification.
     * 
     */
    private String class_;
    /**
     * @return Shard instance description.
     * 
     */
    private String description;
    /**
     * @return Shard instance ID.
     * 
     */
    private String nodeId;
    /**
     * @return Shard disk.
     * 
     */
    private Integer storage;

    private GetInstancesInstanceShard() {}
    /**
     * @return Shard instance specification.
     * 
     */
    public String class_() {
        return this.class_;
    }
    /**
     * @return Shard instance description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Shard instance ID.
     * 
     */
    public String nodeId() {
        return this.nodeId;
    }
    /**
     * @return Shard disk.
     * 
     */
    public Integer storage() {
        return this.storage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstancesInstanceShard defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String class_;
        private String description;
        private String nodeId;
        private Integer storage;
        public Builder() {}
        public Builder(GetInstancesInstanceShard defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.class_ = defaults.class_;
    	      this.description = defaults.description;
    	      this.nodeId = defaults.nodeId;
    	      this.storage = defaults.storage;
        }

        @CustomType.Setter("class")
        public Builder class_(String class_) {
            this.class_ = Objects.requireNonNull(class_);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }
        @CustomType.Setter
        public Builder storage(Integer storage) {
            this.storage = Objects.requireNonNull(storage);
            return this;
        }
        public GetInstancesInstanceShard build() {
            final var _resultValue = new GetInstancesInstanceShard();
            _resultValue.class_ = class_;
            _resultValue.description = description;
            _resultValue.nodeId = nodeId;
            _resultValue.storage = storage;
            return _resultValue;
        }
    }
}
