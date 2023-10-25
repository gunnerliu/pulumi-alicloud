// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ga
{
    /// <summary>
    /// Provides a Global Accelerator (GA) Basic Accelerate IP resource.
    /// 
    /// For information about Global Accelerator (GA) Basic Accelerate IP and how to use it, see [What is Basic Accelerate IP](https://www.alibabacloud.com/help/en/global-accelerator/latest/api-ga-2019-11-20-createbasicaccelerateip).
    /// 
    /// &gt; **NOTE:** Available since v1.194.0.
    /// 
    /// ## Import
    /// 
    /// Global Accelerator (GA) Basic Accelerate IP can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ga/basicAccelerateIp:BasicAccelerateIp example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ga/basicAccelerateIp:BasicAccelerateIp")]
    public partial class BasicAccelerateIp : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The address of the Basic Accelerate IP.
        /// </summary>
        [Output("accelerateIpAddress")]
        public Output<string> AccelerateIpAddress { get; private set; } = null!;

        /// <summary>
        /// The ID of the Basic GA instance.
        /// </summary>
        [Output("acceleratorId")]
        public Output<string> AcceleratorId { get; private set; } = null!;

        /// <summary>
        /// The ID of the Basic Ip Set.
        /// </summary>
        [Output("ipSetId")]
        public Output<string> IpSetId { get; private set; } = null!;

        /// <summary>
        /// The status of the Basic Accelerate IP instance.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;


        /// <summary>
        /// Create a BasicAccelerateIp resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BasicAccelerateIp(string name, BasicAccelerateIpArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ga/basicAccelerateIp:BasicAccelerateIp", name, args ?? new BasicAccelerateIpArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BasicAccelerateIp(string name, Input<string> id, BasicAccelerateIpState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ga/basicAccelerateIp:BasicAccelerateIp", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BasicAccelerateIp resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BasicAccelerateIp Get(string name, Input<string> id, BasicAccelerateIpState? state = null, CustomResourceOptions? options = null)
        {
            return new BasicAccelerateIp(name, id, state, options);
        }
    }

    public sealed class BasicAccelerateIpArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the Basic GA instance.
        /// </summary>
        [Input("acceleratorId", required: true)]
        public Input<string> AcceleratorId { get; set; } = null!;

        /// <summary>
        /// The ID of the Basic Ip Set.
        /// </summary>
        [Input("ipSetId", required: true)]
        public Input<string> IpSetId { get; set; } = null!;

        public BasicAccelerateIpArgs()
        {
        }
        public static new BasicAccelerateIpArgs Empty => new BasicAccelerateIpArgs();
    }

    public sealed class BasicAccelerateIpState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The address of the Basic Accelerate IP.
        /// </summary>
        [Input("accelerateIpAddress")]
        public Input<string>? AccelerateIpAddress { get; set; }

        /// <summary>
        /// The ID of the Basic GA instance.
        /// </summary>
        [Input("acceleratorId")]
        public Input<string>? AcceleratorId { get; set; }

        /// <summary>
        /// The ID of the Basic Ip Set.
        /// </summary>
        [Input("ipSetId")]
        public Input<string>? IpSetId { get; set; }

        /// <summary>
        /// The status of the Basic Accelerate IP instance.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        public BasicAccelerateIpState()
        {
        }
        public static new BasicAccelerateIpState Empty => new BasicAccelerateIpState();
    }
}
