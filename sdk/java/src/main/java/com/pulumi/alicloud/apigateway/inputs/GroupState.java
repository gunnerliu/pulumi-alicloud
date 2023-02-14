// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.apigateway.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GroupState extends com.pulumi.resources.ResourceArgs {

    public static final GroupState Empty = new GroupState();

    /**
     * The description of the api gateway group. Defaults to null.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the api gateway group. Defaults to null.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The id of the api gateway.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return The id of the api gateway.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * The name of the api gateway group. Defaults to null.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the api gateway group. Defaults to null.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     * 
     */
    @Import(name="subDomain")
    private @Nullable Output<String> subDomain;

    /**
     * @return (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
     * 
     */
    public Optional<Output<String>> subDomain() {
        return Optional.ofNullable(this.subDomain);
    }

    /**
     * (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     * 
     */
    @Import(name="vpcDomain")
    private @Nullable Output<String> vpcDomain;

    /**
     * @return (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
     * 
     */
    public Optional<Output<String>> vpcDomain() {
        return Optional.ofNullable(this.vpcDomain);
    }

    private GroupState() {}

    private GroupState(GroupState $) {
        this.description = $.description;
        this.instanceId = $.instanceId;
        this.name = $.name;
        this.subDomain = $.subDomain;
        this.vpcDomain = $.vpcDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GroupState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GroupState $;

        public Builder() {
            $ = new GroupState();
        }

        public Builder(GroupState defaults) {
            $ = new GroupState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description The description of the api gateway group. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the api gateway group. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param instanceId The id of the api gateway.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId The id of the api gateway.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param name The name of the api gateway group. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the api gateway group. Defaults to null.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param subDomain (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
         * 
         * @return builder
         * 
         */
        public Builder subDomain(@Nullable Output<String> subDomain) {
            $.subDomain = subDomain;
            return this;
        }

        /**
         * @param subDomain (Available in 1.69.0+)	Second-level domain name automatically assigned to the API group.
         * 
         * @return builder
         * 
         */
        public Builder subDomain(String subDomain) {
            return subDomain(Output.of(subDomain));
        }

        /**
         * @param vpcDomain (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
         * 
         * @return builder
         * 
         */
        public Builder vpcDomain(@Nullable Output<String> vpcDomain) {
            $.vpcDomain = vpcDomain;
            return this;
        }

        /**
         * @param vpcDomain (Available in 1.69.0+)	Second-level VPC domain name automatically assigned to the API group.
         * 
         * @return builder
         * 
         */
        public Builder vpcDomain(String vpcDomain) {
            return vpcDomain(Output.of(vpcDomain));
        }

        public GroupState build() {
            return $;
        }
    }

}