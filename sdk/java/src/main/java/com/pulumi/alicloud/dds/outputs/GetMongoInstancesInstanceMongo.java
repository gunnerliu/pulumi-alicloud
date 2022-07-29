// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dds.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMongoInstancesInstanceMongo {
    private final String class_;
    private final String description;
    private final String nodeId;

    @CustomType.Constructor
    private GetMongoInstancesInstanceMongo(
        @CustomType.Parameter("class") String class_,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("nodeId") String nodeId) {
        this.class_ = class_;
        this.description = description;
        this.nodeId = nodeId;
    }

    public String class_() {
        return this.class_;
    }
    public String description() {
        return this.description;
    }
    public String nodeId() {
        return this.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMongoInstancesInstanceMongo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String class_;
        private String description;
        private String nodeId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMongoInstancesInstanceMongo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.class_ = defaults.class_;
    	      this.description = defaults.description;
    	      this.nodeId = defaults.nodeId;
        }

        public Builder class_(String class_) {
            this.class_ = Objects.requireNonNull(class_);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder nodeId(String nodeId) {
            this.nodeId = Objects.requireNonNull(nodeId);
            return this;
        }        public GetMongoInstancesInstanceMongo build() {
            return new GetMongoInstancesInstanceMongo(class_, description, nodeId);
        }
    }
}
