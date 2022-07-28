// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsDedicatedHostClusterArgs extends com.pulumi.resources.ResourceArgs {

    public static final EcsDedicatedHostClusterArgs Empty = new EcsDedicatedHostClusterArgs();

    /**
     * The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     * 
     */
    @Import(name="dedicatedHostClusterName")
    private @Nullable Output<String> dedicatedHostClusterName;

    /**
     * @return The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> dedicatedHostClusterName() {
        return Optional.ofNullable(this.dedicatedHostClusterName);
    }

    /**
     * The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The dry run.
     * 
     */
    @Import(name="dryRun")
    private @Nullable Output<Boolean> dryRun;

    /**
     * @return The dry run.
     * 
     */
    public Optional<Output<Boolean>> dryRun() {
        return Optional.ofNullable(this.dryRun);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,Object>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,Object>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The ID of the zone in which to create the dedicated host cluster.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    /**
     * @return The ID of the zone in which to create the dedicated host cluster.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    private EcsDedicatedHostClusterArgs() {}

    private EcsDedicatedHostClusterArgs(EcsDedicatedHostClusterArgs $) {
        this.dedicatedHostClusterName = $.dedicatedHostClusterName;
        this.description = $.description;
        this.dryRun = $.dryRun;
        this.tags = $.tags;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsDedicatedHostClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsDedicatedHostClusterArgs $;

        public Builder() {
            $ = new EcsDedicatedHostClusterArgs();
        }

        public Builder(EcsDedicatedHostClusterArgs defaults) {
            $ = new EcsDedicatedHostClusterArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param dedicatedHostClusterName The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostClusterName(@Nullable Output<String> dedicatedHostClusterName) {
            $.dedicatedHostClusterName = dedicatedHostClusterName;
            return this;
        }

        /**
         * @param dedicatedHostClusterName The name of the dedicated host cluster. The name must be `2` to `128` characters in length and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter. It cannot contain `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder dedicatedHostClusterName(String dedicatedHostClusterName) {
            return dedicatedHostClusterName(Output.of(dedicatedHostClusterName));
        }

        /**
         * @param description The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the dedicated host cluster. The description must be `2` to `256` characters in length. It cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(@Nullable Output<Boolean> dryRun) {
            $.dryRun = dryRun;
            return this;
        }

        /**
         * @param dryRun The dry run.
         * 
         * @return builder
         * 
         */
        public Builder dryRun(Boolean dryRun) {
            return dryRun(Output.of(dryRun));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,Object>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,Object> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param zoneId The ID of the zone in which to create the dedicated host cluster.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        /**
         * @param zoneId The ID of the zone in which to create the dedicated host cluster.
         * 
         * @return builder
         * 
         */
        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public EcsDedicatedHostClusterArgs build() {
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
