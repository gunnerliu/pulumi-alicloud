// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.actiontrail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSaslAclsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSaslAclsArgs Empty = new GetSaslAclsArgs();

    /**
     * Get results for the specified resource name.
     * 
     */
    @Import(name="aclResourceName", required=true)
    private Output<String> aclResourceName;

    /**
     * @return Get results for the specified resource name.
     * 
     */
    public Output<String> aclResourceName() {
        return this.aclResourceName;
    }

    /**
     * Get results for the specified resource type.
     * 
     */
    @Import(name="aclResourceType", required=true)
    private Output<String> aclResourceType;

    /**
     * @return Get results for the specified resource type.
     * 
     */
    public Output<String> aclResourceType() {
        return this.aclResourceType;
    }

    /**
     * ID of the ALIKAFKA Instance that owns the sasl acls.
     * 
     */
    @Import(name="instanceId", required=true)
    private Output<String> instanceId;

    /**
     * @return ID of the ALIKAFKA Instance that owns the sasl acls.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    @Import(name="outputFile")
    private @Nullable Output<String> outputFile;

    public Optional<Output<String>> outputFile() {
        return Optional.ofNullable(this.outputFile);
    }

    /**
     * Get results for the specified username.
     * 
     */
    @Import(name="username", required=true)
    private Output<String> username;

    /**
     * @return Get results for the specified username.
     * 
     */
    public Output<String> username() {
        return this.username;
    }

    private GetSaslAclsArgs() {}

    private GetSaslAclsArgs(GetSaslAclsArgs $) {
        this.aclResourceName = $.aclResourceName;
        this.aclResourceType = $.aclResourceType;
        this.instanceId = $.instanceId;
        this.outputFile = $.outputFile;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSaslAclsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSaslAclsArgs $;

        public Builder() {
            $ = new GetSaslAclsArgs();
        }

        public Builder(GetSaslAclsArgs defaults) {
            $ = new GetSaslAclsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param aclResourceName Get results for the specified resource name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(Output<String> aclResourceName) {
            $.aclResourceName = aclResourceName;
            return this;
        }

        /**
         * @param aclResourceName Get results for the specified resource name.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceName(String aclResourceName) {
            return aclResourceName(Output.of(aclResourceName));
        }

        /**
         * @param aclResourceType Get results for the specified resource type.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(Output<String> aclResourceType) {
            $.aclResourceType = aclResourceType;
            return this;
        }

        /**
         * @param aclResourceType Get results for the specified resource type.
         * 
         * @return builder
         * 
         */
        public Builder aclResourceType(String aclResourceType) {
            return aclResourceType(Output.of(aclResourceType));
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the sasl acls.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId ID of the ALIKAFKA Instance that owns the sasl acls.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        public Builder outputFile(@Nullable Output<String> outputFile) {
            $.outputFile = outputFile;
            return this;
        }

        public Builder outputFile(String outputFile) {
            return outputFile(Output.of(outputFile));
        }

        /**
         * @param username Get results for the specified username.
         * 
         * @return builder
         * 
         */
        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username Get results for the specified username.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        public GetSaslAclsArgs build() {
            $.aclResourceName = Objects.requireNonNull($.aclResourceName, "expected parameter 'aclResourceName' to be non-null");
            $.aclResourceType = Objects.requireNonNull($.aclResourceType, "expected parameter 'aclResourceType' to be non-null");
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
