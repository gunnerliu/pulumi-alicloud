// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.nas.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AccessRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AccessRuleState Empty = new AccessRuleState();

    /**
     * Permission group name.
     * 
     */
    @Import(name="accessGroupName")
    private @Nullable Output<String> accessGroupName;

    /**
     * @return Permission group name.
     * 
     */
    public Optional<Output<String>> accessGroupName() {
        return Optional.ofNullable(this.accessGroupName);
    }

    /**
     * The nas access rule ID.
     * 
     */
    @Import(name="accessRuleId")
    private @Nullable Output<String> accessRuleId;

    /**
     * @return The nas access rule ID.
     * 
     */
    public Optional<Output<String>> accessRuleId() {
        return Optional.ofNullable(this.accessRuleId);
    }

    /**
     * Priority level. Range: 1-100. Default value: `1`.
     * 
     */
    @Import(name="priority")
    private @Nullable Output<Integer> priority;

    /**
     * @return Priority level. Range: 1-100. Default value: `1`.
     * 
     */
    public Optional<Output<Integer>> priority() {
        return Optional.ofNullable(this.priority);
    }

    /**
     * Read-write permission type: `RDWR` (default), `RDONLY`.
     * 
     */
    @Import(name="rwAccessType")
    private @Nullable Output<String> rwAccessType;

    /**
     * @return Read-write permission type: `RDWR` (default), `RDONLY`.
     * 
     */
    public Optional<Output<String>> rwAccessType() {
        return Optional.ofNullable(this.rwAccessType);
    }

    /**
     * Address or address segment.
     * 
     */
    @Import(name="sourceCidrIp")
    private @Nullable Output<String> sourceCidrIp;

    /**
     * @return Address or address segment.
     * 
     */
    public Optional<Output<String>> sourceCidrIp() {
        return Optional.ofNullable(this.sourceCidrIp);
    }

    /**
     * User permission type: `no_squash` (default), `root_squash`, `all_squash`.
     * 
     */
    @Import(name="userAccessType")
    private @Nullable Output<String> userAccessType;

    /**
     * @return User permission type: `no_squash` (default), `root_squash`, `all_squash`.
     * 
     */
    public Optional<Output<String>> userAccessType() {
        return Optional.ofNullable(this.userAccessType);
    }

    private AccessRuleState() {}

    private AccessRuleState(AccessRuleState $) {
        this.accessGroupName = $.accessGroupName;
        this.accessRuleId = $.accessRuleId;
        this.priority = $.priority;
        this.rwAccessType = $.rwAccessType;
        this.sourceCidrIp = $.sourceCidrIp;
        this.userAccessType = $.userAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccessRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccessRuleState $;

        public Builder() {
            $ = new AccessRuleState();
        }

        public Builder(AccessRuleState defaults) {
            $ = new AccessRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessGroupName Permission group name.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(@Nullable Output<String> accessGroupName) {
            $.accessGroupName = accessGroupName;
            return this;
        }

        /**
         * @param accessGroupName Permission group name.
         * 
         * @return builder
         * 
         */
        public Builder accessGroupName(String accessGroupName) {
            return accessGroupName(Output.of(accessGroupName));
        }

        /**
         * @param accessRuleId The nas access rule ID.
         * 
         * @return builder
         * 
         */
        public Builder accessRuleId(@Nullable Output<String> accessRuleId) {
            $.accessRuleId = accessRuleId;
            return this;
        }

        /**
         * @param accessRuleId The nas access rule ID.
         * 
         * @return builder
         * 
         */
        public Builder accessRuleId(String accessRuleId) {
            return accessRuleId(Output.of(accessRuleId));
        }

        /**
         * @param priority Priority level. Range: 1-100. Default value: `1`.
         * 
         * @return builder
         * 
         */
        public Builder priority(@Nullable Output<Integer> priority) {
            $.priority = priority;
            return this;
        }

        /**
         * @param priority Priority level. Range: 1-100. Default value: `1`.
         * 
         * @return builder
         * 
         */
        public Builder priority(Integer priority) {
            return priority(Output.of(priority));
        }

        /**
         * @param rwAccessType Read-write permission type: `RDWR` (default), `RDONLY`.
         * 
         * @return builder
         * 
         */
        public Builder rwAccessType(@Nullable Output<String> rwAccessType) {
            $.rwAccessType = rwAccessType;
            return this;
        }

        /**
         * @param rwAccessType Read-write permission type: `RDWR` (default), `RDONLY`.
         * 
         * @return builder
         * 
         */
        public Builder rwAccessType(String rwAccessType) {
            return rwAccessType(Output.of(rwAccessType));
        }

        /**
         * @param sourceCidrIp Address or address segment.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(@Nullable Output<String> sourceCidrIp) {
            $.sourceCidrIp = sourceCidrIp;
            return this;
        }

        /**
         * @param sourceCidrIp Address or address segment.
         * 
         * @return builder
         * 
         */
        public Builder sourceCidrIp(String sourceCidrIp) {
            return sourceCidrIp(Output.of(sourceCidrIp));
        }

        /**
         * @param userAccessType User permission type: `no_squash` (default), `root_squash`, `all_squash`.
         * 
         * @return builder
         * 
         */
        public Builder userAccessType(@Nullable Output<String> userAccessType) {
            $.userAccessType = userAccessType;
            return this;
        }

        /**
         * @param userAccessType User permission type: `no_squash` (default), `root_squash`, `all_squash`.
         * 
         * @return builder
         * 
         */
        public Builder userAccessType(String userAccessType) {
            return userAccessType(Output.of(userAccessType));
        }

        public AccessRuleState build() {
            return $;
        }
    }

}
