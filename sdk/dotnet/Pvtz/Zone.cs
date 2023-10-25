// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Pvtz
{
    /// <summary>
    /// ## Import
    /// 
    /// Private Zone can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:pvtz/zone:Zone example abc123456
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:pvtz/zone:Zone")]
    public partial class Zone : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether the Private Zone is ptr.
        /// </summary>
        [Output("isPtr")]
        public Output<bool> IsPtr { get; private set; } = null!;

        /// <summary>
        /// The language. Valid values: "zh", "en", "jp".
        /// </summary>
        [Output("lang")]
        public Output<string?> Lang { get; private set; } = null!;

        /// <summary>
        /// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The recursive DNS proxy. Valid values:
        /// - ZONE: indicates that the recursive DNS proxy is disabled.
        /// - RECORD: indicates that the recursive DNS proxy is enabled.
        /// Default to "ZONE".
        /// </summary>
        [Output("proxyPattern")]
        public Output<string?> ProxyPattern { get; private set; } = null!;

        /// <summary>
        /// The count of the Private Zone Record.
        /// </summary>
        [Output("recordCount")]
        public Output<int> RecordCount { get; private set; } = null!;

        /// <summary>
        /// The remark of the Private Zone.
        /// </summary>
        [Output("remark")]
        public Output<string?> Remark { get; private set; } = null!;

        /// <summary>
        /// The Id of resource group which the Private Zone belongs.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string?> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `sync_status` to enable/disable the host synchronization task.
        /// </summary>
        [Output("syncStatus")]
        public Output<string?> SyncStatus { get; private set; } = null!;

        /// <summary>
        /// The IP address of the client.
        /// </summary>
        [Output("userClientIp")]
        public Output<string?> UserClientIp { get; private set; } = null!;

        /// <summary>
        /// The user information of the host synchronization task. The details see Block `user_info`.
        /// </summary>
        [Output("userInfos")]
        public Output<ImmutableArray<Outputs.ZoneUserInfo>> UserInfos { get; private set; } = null!;

        /// <summary>
        /// The zone_name of the Private Zone. The `zone_name` is required when the value of the `name`  is Empty.
        /// </summary>
        [Output("zoneName")]
        public Output<string> ZoneName { get; private set; } = null!;


        /// <summary>
        /// Create a Zone resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Zone(string name, ZoneArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/zone:Zone", name, args ?? new ZoneArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Zone(string name, Input<string> id, ZoneState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:pvtz/zone:Zone", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Zone resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Zone Get(string name, Input<string> id, ZoneState? state = null, CustomResourceOptions? options = null)
        {
            return new Zone(name, id, state, options);
        }
    }

    public sealed class ZoneArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The language. Valid values: "zh", "en", "jp".
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The recursive DNS proxy. Valid values:
        /// - ZONE: indicates that the recursive DNS proxy is disabled.
        /// - RECORD: indicates that the recursive DNS proxy is enabled.
        /// Default to "ZONE".
        /// </summary>
        [Input("proxyPattern")]
        public Input<string>? ProxyPattern { get; set; }

        /// <summary>
        /// The remark of the Private Zone.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The Id of resource group which the Private Zone belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `sync_status` to enable/disable the host synchronization task.
        /// </summary>
        [Input("syncStatus")]
        public Input<string>? SyncStatus { get; set; }

        /// <summary>
        /// The IP address of the client.
        /// </summary>
        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        [Input("userInfos")]
        private InputList<Inputs.ZoneUserInfoArgs>? _userInfos;

        /// <summary>
        /// The user information of the host synchronization task. The details see Block `user_info`.
        /// </summary>
        public InputList<Inputs.ZoneUserInfoArgs> UserInfos
        {
            get => _userInfos ?? (_userInfos = new InputList<Inputs.ZoneUserInfoArgs>());
            set => _userInfos = value;
        }

        /// <summary>
        /// The zone_name of the Private Zone. The `zone_name` is required when the value of the `name`  is Empty.
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public ZoneArgs()
        {
        }
        public static new ZoneArgs Empty => new ZoneArgs();
    }

    public sealed class ZoneState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether the Private Zone is ptr.
        /// </summary>
        [Input("isPtr")]
        public Input<bool>? IsPtr { get; set; }

        /// <summary>
        /// The language. Valid values: "zh", "en", "jp".
        /// </summary>
        [Input("lang")]
        public Input<string>? Lang { get; set; }

        /// <summary>
        /// The name of the Private Zone. The `name` has been deprecated from provider version 1.107.0. Please use 'zone_name' instead.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The recursive DNS proxy. Valid values:
        /// - ZONE: indicates that the recursive DNS proxy is disabled.
        /// - RECORD: indicates that the recursive DNS proxy is enabled.
        /// Default to "ZONE".
        /// </summary>
        [Input("proxyPattern")]
        public Input<string>? ProxyPattern { get; set; }

        /// <summary>
        /// The count of the Private Zone Record.
        /// </summary>
        [Input("recordCount")]
        public Input<int>? RecordCount { get; set; }

        /// <summary>
        /// The remark of the Private Zone.
        /// </summary>
        [Input("remark")]
        public Input<string>? Remark { get; set; }

        /// <summary>
        /// The Id of resource group which the Private Zone belongs.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        /// <summary>
        /// The status of the host synchronization task. Valid values:  `ON`,`OFF`. **NOTE:** You can update the `sync_status` to enable/disable the host synchronization task.
        /// </summary>
        [Input("syncStatus")]
        public Input<string>? SyncStatus { get; set; }

        /// <summary>
        /// The IP address of the client.
        /// </summary>
        [Input("userClientIp")]
        public Input<string>? UserClientIp { get; set; }

        [Input("userInfos")]
        private InputList<Inputs.ZoneUserInfoGetArgs>? _userInfos;

        /// <summary>
        /// The user information of the host synchronization task. The details see Block `user_info`.
        /// </summary>
        public InputList<Inputs.ZoneUserInfoGetArgs> UserInfos
        {
            get => _userInfos ?? (_userInfos = new InputList<Inputs.ZoneUserInfoGetArgs>());
            set => _userInfos = value;
        }

        /// <summary>
        /// The zone_name of the Private Zone. The `zone_name` is required when the value of the `name`  is Empty.
        /// </summary>
        [Input("zoneName")]
        public Input<string>? ZoneName { get; set; }

        public ZoneState()
        {
        }
        public static new ZoneState Empty => new ZoneState();
    }
}
