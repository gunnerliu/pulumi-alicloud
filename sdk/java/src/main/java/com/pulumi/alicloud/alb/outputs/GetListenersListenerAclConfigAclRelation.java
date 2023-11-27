// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alb.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenersListenerAclConfigAclRelation {
    /**
     * @return Snooping Binding of the Access Policy Group ID List.
     * 
     */
    private String aclId;
    /**
     * @return The association status between the ACL and the listener.  Valid values: `Associating`, `Associated` Or `Dissociating`. `Associating`: The ACL is being associated with the listener. `Associated`: The ACL is associated with the listener. `Dissociating`: The ACL is being disassociated from the listener.
     * 
     */
    private String status;

    private GetListenersListenerAclConfigAclRelation() {}
    /**
     * @return Snooping Binding of the Access Policy Group ID List.
     * 
     */
    public String aclId() {
        return this.aclId;
    }
    /**
     * @return The association status between the ACL and the listener.  Valid values: `Associating`, `Associated` Or `Dissociating`. `Associating`: The ACL is being associated with the listener. `Associated`: The ACL is associated with the listener. `Dissociating`: The ACL is being disassociated from the listener.
     * 
     */
    public String status() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenersListenerAclConfigAclRelation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String aclId;
        private String status;
        public Builder() {}
        public Builder(GetListenersListenerAclConfigAclRelation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aclId = defaults.aclId;
    	      this.status = defaults.status;
        }

        @CustomType.Setter
        public Builder aclId(String aclId) {
            this.aclId = Objects.requireNonNull(aclId);
            return this;
        }
        @CustomType.Setter
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public GetListenersListenerAclConfigAclRelation build() {
            final var _resultValue = new GetListenersListenerAclConfigAclRelation();
            _resultValue.aclId = aclId;
            _resultValue.status = status;
            return _resultValue;
        }
    }
}
