// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.directmail.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetReceiversReceiverse {
    /**
     * @return The creation time of the resource.
     * 
     */
    private String createTime;
    /**
     * @return The description.
     * 
     */
    private String description;
    /**
     * @return The ID of the Receivers.
     * 
     */
    private String id;
    /**
     * @return The Receivers Alias.
     * 
     */
    private String receiversAlias;
    /**
     * @return The first ID of the resource.
     * 
     */
    private String receiversId;
    /**
     * @return The name of the resource.
     * 
     */
    private String receiversName;
    /**
     * @return The status of the resource.
     * 
     */
    private Integer status;

    private GetReceiversReceiverse() {}
    /**
     * @return The creation time of the resource.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    /**
     * @return The description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The ID of the Receivers.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Receivers Alias.
     * 
     */
    public String receiversAlias() {
        return this.receiversAlias;
    }
    /**
     * @return The first ID of the resource.
     * 
     */
    public String receiversId() {
        return this.receiversId;
    }
    /**
     * @return The name of the resource.
     * 
     */
    public String receiversName() {
        return this.receiversName;
    }
    /**
     * @return The status of the resource.
     * 
     */
    public Integer status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetReceiversReceiverse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String createTime;
        private String description;
        private String id;
        private String receiversAlias;
        private String receiversId;
        private String receiversName;
        private Integer status;
        public Builder() {}
        public Builder(GetReceiversReceiverse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.receiversAlias = defaults.receiversAlias;
    	      this.receiversId = defaults.receiversId;
    	      this.receiversName = defaults.receiversName;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder receiversAlias(String receiversAlias) {
            this.receiversAlias = Objects.requireNonNull(receiversAlias);
            return this;
        }
        @CustomType.Setter
        public Builder receiversId(String receiversId) {
            this.receiversId = Objects.requireNonNull(receiversId);
            return this;
        }
        @CustomType.Setter
        public Builder receiversName(String receiversName) {
            this.receiversName = Objects.requireNonNull(receiversName);
            return this;
        }
        @CustomType.Setter
        public Builder status(Integer status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetReceiversReceiverse build() {
            final var _resultValue = new GetReceiversReceiverse();
            _resultValue.createTime = createTime;
            _resultValue.description = description;
            _resultValue.id = id;
            _resultValue.receiversAlias = receiversAlias;
            _resultValue.receiversId = receiversId;
            _resultValue.receiversName = receiversName;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
