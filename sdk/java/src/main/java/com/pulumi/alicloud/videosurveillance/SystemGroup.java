// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.videosurveillance;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.videosurveillance.SystemGroupArgs;
import com.pulumi.alicloud.videosurveillance.inputs.SystemGroupState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Video Surveillance System Group resource.
 * 
 * For information about Video Surveillance System Group and how to use it, see [What is Group](https://help.aliyun.com/product/108765.html).
 * 
 * &gt; **NOTE:** Available in v1.135.0+.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Video Surveillance System Group can be imported using the id, e.g.
 * 
 * ```sh
 *  $ pulumi import alicloud:videosurveillance/systemGroup:SystemGroup example &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="alicloud:videosurveillance/systemGroup:SystemGroup")
public class SystemGroup extends com.pulumi.resources.CustomResource {
    /**
     * The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
     * 
     */
    @Export(name="callback", type=String.class, parameters={})
    private Output</* @Nullable */ String> callback;

    /**
     * @return The space within the device status update of the callback, need to start with http:// or https:// at the beginning.
     * 
     */
    public Output<Optional<String>> callback() {
        return Codegen.optional(this.callback);
    }
    /**
     * The capture image.
     * 
     */
    @Export(name="captureImage", type=Integer.class, parameters={})
    private Output<Integer> captureImage;

    /**
     * @return The capture image.
     * 
     */
    public Output<Integer> captureImage() {
        return this.captureImage;
    }
    /**
     * The capture interval.
     * 
     */
    @Export(name="captureInterval", type=Integer.class, parameters={})
    private Output<Integer> captureInterval;

    /**
     * @return The capture interval.
     * 
     */
    public Output<Integer> captureInterval() {
        return this.captureInterval;
    }
    /**
     * The capture oss bucket.
     * 
     */
    @Export(name="captureOssBucket", type=String.class, parameters={})
    private Output<String> captureOssBucket;

    /**
     * @return The capture oss bucket.
     * 
     */
    public Output<String> captureOssBucket() {
        return this.captureOssBucket;
    }
    /**
     * The capture oss path.
     * 
     */
    @Export(name="captureOssPath", type=String.class, parameters={})
    private Output<String> captureOssPath;

    /**
     * @return The capture oss path.
     * 
     */
    public Output<String> captureOssPath() {
        return this.captureOssPath;
    }
    /**
     * The capture video.
     * 
     */
    @Export(name="captureVideo", type=Integer.class, parameters={})
    private Output<Integer> captureVideo;

    /**
     * @return The capture video.
     * 
     */
    public Output<Integer> captureVideo() {
        return this.captureVideo;
    }
    /**
     * The description of Group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of Group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether to open Group.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether to open Group.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The Group Name.
     * 
     */
    @Export(name="groupName", type=String.class, parameters={})
    private Output<String> groupName;

    /**
     * @return The Group Name.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }
    /**
     * The use of the access protocol support gb28181, Real Time Messaging Protocol (rtmp). Valid values: `gb28181`, `rtmp`.
     * 
     */
    @Export(name="inProtocol", type=String.class, parameters={})
    private Output<String> inProtocol;

    /**
     * @return The use of the access protocol support gb28181, Real Time Messaging Protocol (rtmp). Valid values: `gb28181`, `rtmp`.
     * 
     */
    public Output<String> inProtocol() {
        return this.inProtocol;
    }
    /**
     * Whether to enable on-demand streaming. Default value:`false`.
     * 
     */
    @Export(name="lazyPull", type=Boolean.class, parameters={})
    private Output<Boolean> lazyPull;

    /**
     * @return Whether to enable on-demand streaming. Default value:`false`.
     * 
     */
    public Output<Boolean> lazyPull() {
        return this.lazyPull;
    }
    /**
     * The playback protocol used by the space, multiple values are separated by commas (,). Valid values: `flv`,`hls`, `rtmp`.
     * 
     */
    @Export(name="outProtocol", type=String.class, parameters={})
    private Output<String> outProtocol;

    /**
     * @return The playback protocol used by the space, multiple values are separated by commas (,). Valid values: `flv`,`hls`, `rtmp`.
     * 
     */
    public Output<String> outProtocol() {
        return this.outProtocol;
    }
    /**
     * The domain name of plan streaming used by the group.
     * 
     */
    @Export(name="playDomain", type=String.class, parameters={})
    private Output<String> playDomain;

    /**
     * @return The domain name of plan streaming used by the group.
     * 
     */
    public Output<String> playDomain() {
        return this.playDomain;
    }
    /**
     * The domain name of push streaming used by the group.
     * 
     */
    @Export(name="pushDomain", type=String.class, parameters={})
    private Output<String> pushDomain;

    /**
     * @return The domain name of push streaming used by the group.
     * 
     */
    public Output<String> pushDomain() {
        return this.pushDomain;
    }
    /**
     * Whether to open Group. Valid values: `on`,`off`.
     * 
     */
    @Export(name="status", type=Boolean.class, parameters={})
    private Output<Boolean> status;

    /**
     * @return Whether to open Group. Valid values: `on`,`off`.
     * 
     */
    public Output<Boolean> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SystemGroup(String name) {
        this(name, SystemGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SystemGroup(String name, SystemGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SystemGroup(String name, SystemGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:videosurveillance/systemGroup:SystemGroup", name, args == null ? SystemGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SystemGroup(String name, Output<String> id, @Nullable SystemGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("alicloud:videosurveillance/systemGroup:SystemGroup", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static SystemGroup get(String name, Output<String> id, @Nullable SystemGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SystemGroup(name, id, state, options);
    }
}
