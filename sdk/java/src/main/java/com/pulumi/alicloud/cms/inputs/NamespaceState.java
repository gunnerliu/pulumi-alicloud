// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.cms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NamespaceState extends com.pulumi.resources.ResourceArgs {

    public static final NamespaceState Empty = new NamespaceState();

    /**
     * Description of indicator warehouse.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of indicator warehouse.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
     * - `cms.s1.large`: Data storage duration is 15 days.
     * - `cms.s1.xlarge`: Data storage duration is 32 days.
     * - `cms.s1.2xlarge`: Data storage duration 63 days.
     * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
     * - `cms.s1.6xlarge`: Data storage duration 185 days.
     * - `cms.s1.12xlarge`: Data storage duration 376 days.
     * 
     */
    @Import(name="specification")
    private @Nullable Output<String> specification;

    /**
     * @return Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
     * - `cms.s1.large`: Data storage duration is 15 days.
     * - `cms.s1.xlarge`: Data storage duration is 32 days.
     * - `cms.s1.2xlarge`: Data storage duration 63 days.
     * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
     * - `cms.s1.6xlarge`: Data storage duration 185 days.
     * - `cms.s1.12xlarge`: Data storage duration 376 days.
     * 
     */
    public Optional<Output<String>> specification() {
        return Optional.ofNullable(this.specification);
    }

    private NamespaceState() {}

    private NamespaceState(NamespaceState $) {
        this.description = $.description;
        this.namespace = $.namespace;
        this.specification = $.specification;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NamespaceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NamespaceState $;

        public Builder() {
            $ = new NamespaceState();
        }

        public Builder(NamespaceState defaults) {
            $ = new NamespaceState(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Description of indicator warehouse.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of indicator warehouse.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param namespace Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Indicator warehouse name. The namespace can contain lowercase letters, digits, and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param specification Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
         * - `cms.s1.large`: Data storage duration is 15 days.
         * - `cms.s1.xlarge`: Data storage duration is 32 days.
         * - `cms.s1.2xlarge`: Data storage duration 63 days.
         * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
         * - `cms.s1.6xlarge`: Data storage duration 185 days.
         * - `cms.s1.12xlarge`: Data storage duration 376 days.
         * 
         * @return builder
         * 
         */
        public Builder specification(@Nullable Output<String> specification) {
            $.specification = specification;
            return this;
        }

        /**
         * @param specification Data storage duration. Valid values: `cms.s1.12xlarge`, `cms.s1.2xlarge`, `cms.s1.3xlarge`, `cms.s1.6xlarge`, `cms.s1.large`, `cms.s1.xlarge`.
         * - `cms.s1.large`: Data storage duration is 15 days.
         * - `cms.s1.xlarge`: Data storage duration is 32 days.
         * - `cms.s1.2xlarge`: Data storage duration 63 days.
         * - `cms.s1.3xlarge`: (Default) Data storage duration 93 days.
         * - `cms.s1.6xlarge`: Data storage duration 185 days.
         * - `cms.s1.12xlarge`: Data storage duration 376 days.
         * 
         * @return builder
         * 
         */
        public Builder specification(String specification) {
            return specification(Output.of(specification));
        }

        public NamespaceState build() {
            return $;
        }
    }

}
