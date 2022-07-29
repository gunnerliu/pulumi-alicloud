// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dns.inputs;

import com.pulumi.alicloud.dns.inputs.CustomLineIpSegmentListArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CustomLineState extends com.pulumi.resources.ResourceArgs {

    public static final CustomLineState Empty = new CustomLineState();

    /**
     * The name of the Custom Line.
     * 
     */
    @Import(name="customLineName")
    private @Nullable Output<String> customLineName;

    /**
     * @return The name of the Custom Line.
     * 
     */
    public Optional<Output<String>> customLineName() {
        return Optional.ofNullable(this.customLineName);
    }

    /**
     * The Domain name.
     * 
     */
    @Import(name="domainName")
    private @Nullable Output<String> domainName;

    /**
     * @return The Domain name.
     * 
     */
    public Optional<Output<String>> domainName() {
        return Optional.ofNullable(this.domainName);
    }

    /**
     * The IP segment list. See the following `Block ip_segment_list`.
     * 
     */
    @Import(name="ipSegmentLists")
    private @Nullable Output<List<CustomLineIpSegmentListArgs>> ipSegmentLists;

    /**
     * @return The IP segment list. See the following `Block ip_segment_list`.
     * 
     */
    public Optional<Output<List<CustomLineIpSegmentListArgs>>> ipSegmentLists() {
        return Optional.ofNullable(this.ipSegmentLists);
    }

    /**
     * The lang.
     * 
     */
    @Import(name="lang")
    private @Nullable Output<String> lang;

    /**
     * @return The lang.
     * 
     */
    public Optional<Output<String>> lang() {
        return Optional.ofNullable(this.lang);
    }

    private CustomLineState() {}

    private CustomLineState(CustomLineState $) {
        this.customLineName = $.customLineName;
        this.domainName = $.domainName;
        this.ipSegmentLists = $.ipSegmentLists;
        this.lang = $.lang;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomLineState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomLineState $;

        public Builder() {
            $ = new CustomLineState();
        }

        public Builder(CustomLineState defaults) {
            $ = new CustomLineState(Objects.requireNonNull(defaults));
        }

        /**
         * @param customLineName The name of the Custom Line.
         * 
         * @return builder
         * 
         */
        public Builder customLineName(@Nullable Output<String> customLineName) {
            $.customLineName = customLineName;
            return this;
        }

        /**
         * @param customLineName The name of the Custom Line.
         * 
         * @return builder
         * 
         */
        public Builder customLineName(String customLineName) {
            return customLineName(Output.of(customLineName));
        }

        /**
         * @param domainName The Domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(@Nullable Output<String> domainName) {
            $.domainName = domainName;
            return this;
        }

        /**
         * @param domainName The Domain name.
         * 
         * @return builder
         * 
         */
        public Builder domainName(String domainName) {
            return domainName(Output.of(domainName));
        }

        /**
         * @param ipSegmentLists The IP segment list. See the following `Block ip_segment_list`.
         * 
         * @return builder
         * 
         */
        public Builder ipSegmentLists(@Nullable Output<List<CustomLineIpSegmentListArgs>> ipSegmentLists) {
            $.ipSegmentLists = ipSegmentLists;
            return this;
        }

        /**
         * @param ipSegmentLists The IP segment list. See the following `Block ip_segment_list`.
         * 
         * @return builder
         * 
         */
        public Builder ipSegmentLists(List<CustomLineIpSegmentListArgs> ipSegmentLists) {
            return ipSegmentLists(Output.of(ipSegmentLists));
        }

        /**
         * @param ipSegmentLists The IP segment list. See the following `Block ip_segment_list`.
         * 
         * @return builder
         * 
         */
        public Builder ipSegmentLists(CustomLineIpSegmentListArgs... ipSegmentLists) {
            return ipSegmentLists(List.of(ipSegmentLists));
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(@Nullable Output<String> lang) {
            $.lang = lang;
            return this;
        }

        /**
         * @param lang The lang.
         * 
         * @return builder
         * 
         */
        public Builder lang(String lang) {
            return lang(Output.of(lang));
        }

        public CustomLineState build() {
            return $;
        }
    }

}
