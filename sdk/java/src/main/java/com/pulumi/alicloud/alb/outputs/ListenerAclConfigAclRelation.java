// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ListenerAclConfigAclRelation {
    /**
     * @return Snooping Binding of the Access Policy Group ID List.
     * 
     */
    private @Nullable String aclId;
    /**
     * @return The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
     * 
     */
    private @Nullable String status;

    private ListenerAclConfigAclRelation() {}
    /**
     * @return Snooping Binding of the Access Policy Group ID List.
     * 
     */
    public Optional<String> aclId() {
        return Optional.ofNullable(this.aclId);
    }
    /**
     * @return The state of the listener. Valid Values: `Running` Or `Stopped`. Valid values: `Running`: The listener is running. `Stopped`: The listener is stopped.
     * 
     */
    public Optional<String> status() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerAclConfigAclRelation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String aclId;
        private @Nullable String status;
        public Builder() {}
        public Builder(ListenerAclConfigAclRelation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclId = defaults.aclId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder aclId(@Nullable String aclId) {
            this.aclId = aclId;
            return this;
        }
        @CustomType.Setter
        public Builder status(@Nullable String status) {
            this.status = status;
            return this;
        }
        public ListenerAclConfigAclRelation build() {
            final var _resultValue = new ListenerAclConfigAclRelation();
            _resultValue.aclId = aclId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
