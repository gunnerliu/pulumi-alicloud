// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.alikafka;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class SaslAclArgs extends com.pulumi.resources.ResourceArgs {

    public static final SaslAclArgs Empty = new SaslAclArgs();

    /**
     * Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
     * 
     */
    @Import(name="aclOperationType", required=true)
    private Output<String> aclOperationType;

    /**
     * @return Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
     * 
     */
    public Output<String> aclOperationType() {
        return this.aclOperationType;
    }

    /**
     * Resource name for this acl. The resource name should be a topic or consumer group name.
     * 
     */
    @Import(name="aclResourceName", required=true)
    private Output<String> aclResourceName;

    /**
     * @return Resource name for this acl. The resource name should be a topic or consumer group name.
     * 
     */
    public Output<String> aclResourceName() {
        return this.aclResourceName;
    }

    /**
     * Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
     * 
     */
    @Import(name="aclResourcePatternType", required=true)
    private Output<String> aclResourcePatternType;

    /**
     * @return Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
     * 
     */
    public Output<String> aclResourcePatternType() {
        return this.aclResourcePatternType;
    }

    /**
     * Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
     * 
     */
    @Import(name="aclResourceType", required=true)
    private Output<String> aclResourceType;

    /**
     * @return Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
     * 
     */
    public Output<String> aclResourceType() {
        return this.aclResourceType;
    }

    /**
     * ID of the ALIKAFKA Instance that owns the groups.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return ID of the ALIKAFKA Instance that owns the groups.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     * Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private SaslAclArgs() {}

    private SaslAclArgs(SaslAclArgs $) {
        this.aclOperationType = $.aclOperationType;
        this.aclResourceName = $.aclResourceName;
        this.aclResourcePatternType = $.aclResourcePatternType;
        this.aclResourceType = $.aclResourceType;
        this.instanceId = $.instanceId;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SaslAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SaslAclArgs $;

        public Builder() {
            $ = new SaslAclArgs();
        }

        public Builder(SaslAclArgs defaults) {
            $ = new SaslAclArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclOperationType Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclOperationType(Output<String> aclOperationType) {
            $.aclOperationType = aclOperationType;
            return this;
        }

        /**
         * @param aclOperationType Operation type for this acl. The operation type can only be &#34;Write&#34; and &#34;Read&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclOperationType(String aclOperationType) {
            return aclOperationType(Output.of(aclOperationType));
        }

        /**
         * @param aclResourceName Resource name for this acl. The resource name should be a topic or consumer group name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(Output<String> aclResourceName) {
            $.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * @param aclResourceName Resource name for this acl. The resource name should be a topic or consumer group name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(String aclResourceName) {
            return aclResourceName(Output.of(aclResourceName));
        }

        /**
         * @param aclResourcePatternType Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
         * 
         * @return builder
         * 
         */
        public Builder aclResourcePatternType(Output<String> aclResourcePatternType) {
            $.aclResourcePatternType = aclResourcePatternType;
            return this;
        }

        /**
         * @param aclResourcePatternType Resource pattern type for this acl. The resource pattern support two types &#34;LITERAL&#34; and &#34;PREFIXED&#34;. &#34;LITERAL&#34;: A literal name defines the full name of a resource. The special wildcard character &#34;*&#34; can be used to represent a resource with any name. &#34;PREFIXED&#34;: A prefixed name defines a prefix for a resource.
         * 
         * @return builder
         * 
         */
        public Builder aclResourcePatternType(String aclResourcePatternType) {
            return aclResourcePatternType(Output.of(aclResourcePatternType));
        }

        /**
         * @param aclResourceType Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(Output<String> aclResourceType) {
            $.aclResourceType = aclResourceType;
            return this;
        }

        /**
         * @param aclResourceType Resource type for this acl. The resource type can only be &#34;Topic&#34; and &#34;Group&#34;.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(String aclResourceType) {
            return aclResourceType(Output.of(aclResourceType));
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the groups.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param username Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Username for the sasl user. The length should between 1 to 64 characters. The user should be an existed sasl user.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public SaslAclArgs build() {
            $.aclOperationType = Objects.requireNonNull($.aclOperationType, "expected parameter 'aclOperationType' to be non-null");
            $.aclResourceName = Objects.requireNonNull($.aclResourceName, "expected parameter 'aclResourceName' to be non-null");
            $.aclResourcePatternType = Objects.requireNonNull($.aclResourcePatternType, "expected parameter 'aclResourcePatternType' to be non-null");
            $.aclResourceType = Objects.requireNonNull($.aclResourceType, "expected parameter 'aclResourceType' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
