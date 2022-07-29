// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ecs.inputs;

import com.pulumi.alicloud.ecs.inputs.EcsPrefixListEntryArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EcsPrefixListState extends com.pulumi.resources.ResourceArgs {

    public static final EcsPrefixListState Empty = new EcsPrefixListState();

    /**
     * The IP address family. Valid values: `IPv4`,`IPv6`.
     * 
     */
    @Import(name="addressFamily")
    private @Nullable Output<String> addressFamily;

    /**
     * @return The IP address family. Valid values: `IPv4`,`IPv6`.
     * 
     */
    public Optional<Output<String>> addressFamily() {
        return Optional.ofNullable(this.addressFamily);
    }

    /**
     * The description in entry. The description must be 2 to 32 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description in entry. The description must be 2 to 32 characters in length and cannot start with `http://` or `https://`.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The Entry. The details see Block `entry`.
     * 
     */
    @Import(name="entries")
    private @Nullable Output<List<EcsPrefixListEntryArgs>> entries;

    /**
     * @return The Entry. The details see Block `entry`.
     * 
     */
    public Optional<Output<List<EcsPrefixListEntryArgs>>> entries() {
        return Optional.ofNullable(this.entries);
    }

    /**
     * The maximum number of entries that the prefix list can contain.  Valid values: 1 to 200.
     * 
     */
    @Import(name="maxEntries")
    private @Nullable Output<Integer> maxEntries;

    /**
     * @return The maximum number of entries that the prefix list can contain.  Valid values: 1 to 200.
     * 
     */
    public Optional<Output<Integer>> maxEntries() {
        return Optional.ofNullable(this.maxEntries);
    }

    /**
     * The name of the prefix. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://`, `https://`, `com.aliyun`, or `com.alibabacloud`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
     * 
     */
    @Import(name="prefixListName")
    private @Nullable Output<String> prefixListName;

    /**
     * @return The name of the prefix. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://`, `https://`, `com.aliyun`, or `com.alibabacloud`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
     * 
     */
    public Optional<Output<String>> prefixListName() {
        return Optional.ofNullable(this.prefixListName);
    }

    private EcsPrefixListState() {}

    private EcsPrefixListState(EcsPrefixListState $) {
        this.addressFamily = $.addressFamily;
        this.description = $.description;
        this.entries = $.entries;
        this.maxEntries = $.maxEntries;
        this.prefixListName = $.prefixListName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EcsPrefixListState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EcsPrefixListState $;

        public Builder() {
            $ = new EcsPrefixListState();
        }

        public Builder(EcsPrefixListState defaults) {
            $ = new EcsPrefixListState(Objects.requireNonNull(defaults));
        }

        /**
         * @param addressFamily The IP address family. Valid values: `IPv4`,`IPv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(@Nullable Output<String> addressFamily) {
            $.addressFamily = addressFamily;
            return this;
        }

        /**
         * @param addressFamily The IP address family. Valid values: `IPv4`,`IPv6`.
         * 
         * @return builder
         * 
         */
        public Builder addressFamily(String addressFamily) {
            return addressFamily(Output.of(addressFamily));
        }

        /**
         * @param description The description in entry. The description must be 2 to 32 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description in entry. The description must be 2 to 32 characters in length and cannot start with `http://` or `https://`.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entries The Entry. The details see Block `entry`.
         * 
         * @return builder
         * 
         */
        public Builder entries(@Nullable Output<List<EcsPrefixListEntryArgs>> entries) {
            $.entries = entries;
            return this;
        }

        /**
         * @param entries The Entry. The details see Block `entry`.
         * 
         * @return builder
         * 
         */
        public Builder entries(List<EcsPrefixListEntryArgs> entries) {
            return entries(Output.of(entries));
        }

        /**
         * @param entries The Entry. The details see Block `entry`.
         * 
         * @return builder
         * 
         */
        public Builder entries(EcsPrefixListEntryArgs... entries) {
            return entries(List.of(entries));
        }

        /**
         * @param maxEntries The maximum number of entries that the prefix list can contain.  Valid values: 1 to 200.
         * 
         * @return builder
         * 
         */
        public Builder maxEntries(@Nullable Output<Integer> maxEntries) {
            $.maxEntries = maxEntries;
            return this;
        }

        /**
         * @param maxEntries The maximum number of entries that the prefix list can contain.  Valid values: 1 to 200.
         * 
         * @return builder
         * 
         */
        public Builder maxEntries(Integer maxEntries) {
            return maxEntries(Output.of(maxEntries));
        }

        /**
         * @param prefixListName The name of the prefix. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://`, `https://`, `com.aliyun`, or `com.alibabacloud`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(@Nullable Output<String> prefixListName) {
            $.prefixListName = prefixListName;
            return this;
        }

        /**
         * @param prefixListName The name of the prefix. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with `http://`, `https://`, `com.aliyun`, or `com.alibabacloud`. It can contain letters, digits, colons (:), underscores (_), periods (.), and hyphens (-).
         * 
         * @return builder
         * 
         */
        public Builder prefixListName(String prefixListName) {
            return prefixListName(Output.of(prefixListName));
        }

        public EcsPrefixListState build() {
            return $;
        }
    }

}
