// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.brain.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class IndustrialPidOrganizationState extends com.pulumi.resources.ResourceArgs {

    public static final IndustrialPidOrganizationState Empty = new IndustrialPidOrganizationState();

    /**
     * The ID of parent pid organization.
     * 
     */
    @Import(name="parentPidOrganizationId")
    private @Nullable Output<String> parentPidOrganizationId;

    /**
     * @return The ID of parent pid organization.
     * 
     */
    public Optional<Output<String>> parentPidOrganizationId() {
        return Optional.ofNullable(this.parentPidOrganizationId);
    }

    /**
     * The name of pid organization.
     * 
     */
    @Import(name="pidOrganizationName")
    private @Nullable Output<String> pidOrganizationName;

    /**
     * @return The name of pid organization.
     * 
     */
    public Optional<Output<String>> pidOrganizationName() {
        return Optional.ofNullable(this.pidOrganizationName);
    }

    private IndustrialPidOrganizationState() {}

    private IndustrialPidOrganizationState(IndustrialPidOrganizationState $) {
        this.parentPidOrganizationId = $.parentPidOrganizationId;
        this.pidOrganizationName = $.pidOrganizationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IndustrialPidOrganizationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IndustrialPidOrganizationState $;

        public Builder() {
            $ = new IndustrialPidOrganizationState();
        }

        public Builder(IndustrialPidOrganizationState defaults) {
            $ = new IndustrialPidOrganizationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param parentPidOrganizationId The ID of parent pid organization.
         * 
         * @return builder
         * 
         */
        public Builder parentPidOrganizationId(@Nullable Output<String> parentPidOrganizationId) {
            $.parentPidOrganizationId = parentPidOrganizationId;
            return this;
        }

        /**
         * @param parentPidOrganizationId The ID of parent pid organization.
         * 
         * @return builder
         * 
         */
        public Builder parentPidOrganizationId(String parentPidOrganizationId) {
            return parentPidOrganizationId(Output.of(parentPidOrganizationId));
        }

        /**
         * @param pidOrganizationName The name of pid organization.
         * 
         * @return builder
         * 
         */
        public Builder pidOrganizationName(@Nullable Output<String> pidOrganizationName) {
            $.pidOrganizationName = pidOrganizationName;
            return this;
        }

        /**
         * @param pidOrganizationName The name of pid organization.
         * 
         * @return builder
         * 
         */
        public Builder pidOrganizationName(String pidOrganizationName) {
            return pidOrganizationName(Output.of(pidOrganizationName));
        }

        public IndustrialPidOrganizationState build() {
            return $;
        }
    }

}
