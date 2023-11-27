// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMscSubContactVerificationMessageResult {
    private String contactId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return The sending status of the message. Valid values : `Success`, `Failed`.
     * 
     */
    private String status;
    private Integer type;

    private GetMscSubContactVerificationMessageResult() {}
    public String contactId() {
        return this.contactId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The sending status of the message. Valid values : `Success`, `Failed`.
     * 
     */
    public String status() {
        return this.status;
    }
    public Integer type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMscSubContactVerificationMessageResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contactId;
        private String id;
        private String status;
        private Integer type;
        public Builder() {}
        public Builder(GetMscSubContactVerificationMessageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactId = defaults.contactId;
    	      this.id = defaults.id;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder contactId(String contactId) {
            this.contactId = Objects.requireNonNull(contactId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        @CustomType.Setter
        public Builder type(Integer type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetMscSubContactVerificationMessageResult build() {
            final var _resultValue = new GetMscSubContactVerificationMessageResult();
            _resultValue.contactId = contactId;
            _resultValue.id = id;
            _resultValue.status = status;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
