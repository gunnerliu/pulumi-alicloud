// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ecs
{
    /// <summary>
    /// Provides a ECS Activation resource.
    /// 
    /// For information about ECS Activation and how to use it, see [What is Activation](https://www.alibabacloud.com/help/en/elastic-compute-service/latest/createactivation#doc-api-Ecs-CreateActivation).
    /// 
    /// &gt; **NOTE:** Available in v1.177.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new AliCloud.Ecs.Activation("example", new()
    ///     {
    ///         Description = @var.Name,
    ///         InstanceCount = 10,
    ///         InstanceName = @var.Name,
    ///         IpAddressRange = "0.0.0.0/0",
    ///         TimeToLiveInHours = 4,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// ECS Activation can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ecs/activation:Activation example &lt;id&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:ecs/activation:Activation")]
    public partial class Activation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
        /// </summary>
        [Output("instanceCount")]
        public Output<int> InstanceCount { get; private set; } = null!;

        /// <summary>
        /// The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
        /// - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
        /// - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
        /// </summary>
        [Output("instanceName")]
        public Output<string?> InstanceName { get; private set; } = null!;

        /// <summary>
        /// The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
        /// </summary>
        [Output("ipAddressRange")]
        public Output<string> IpAddressRange { get; private set; } = null!;

        /// <summary>
        /// The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
        /// </summary>
        [Output("timeToLiveInHours")]
        public Output<int> TimeToLiveInHours { get; private set; } = null!;


        /// <summary>
        /// Create a Activation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Activation(string name, ActivationArgs? args = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/activation:Activation", name, args ?? new ActivationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Activation(string name, Input<string> id, ActivationState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ecs/activation:Activation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Activation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Activation Get(string name, Input<string> id, ActivationState? state = null, CustomResourceOptions? options = null)
        {
            return new Activation(name, id, state, options);
        }
    }

    public sealed class ActivationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
        /// - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
        /// - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
        /// </summary>
        [Input("ipAddressRange")]
        public Input<string>? IpAddressRange { get; set; }

        /// <summary>
        /// The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
        /// </summary>
        [Input("timeToLiveInHours")]
        public Input<int>? TimeToLiveInHours { get; set; }

        public ActivationArgs()
        {
        }
        public static new ActivationArgs Empty => new ActivationArgs();
    }

    public sealed class ActivationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The description of the activation code. The description can be 1 to 100 characters in length and cannot start with `http://` or `https://`.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The maximum number of times that the activation code can be used to register managed instances. Valid values: `1` to `1000`. Default value: `10`.
        /// </summary>
        [Input("instanceCount")]
        public Input<int>? InstanceCount { get; set; }

        /// <summary>
        /// The default instance name prefix. The instance name prefix must be 1 to 50 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The instance name prefix can contain only letters, digits, periods (.), underscores (_), hyphens (-), and colons (:).
        /// - If you use the activation code created by the CreateActivation operation to register managed instances, the instances are assigned sequential names that are prefixed by the value of this parameter. You can also specify a new instance name to override the assigned sequential name when you register a managed instance.
        /// - If you specify InstanceName when you register a managed instance, an instance name in the format of `&lt;InstanceName&gt;-&lt;Number&gt;` is generated. The number of digits in the &lt;Number&gt; value is determined by that in the InstanceCount value. Example: 001. If you do not specify InstanceName, the hostname (Hostname) is used as the instance name.
        /// </summary>
        [Input("instanceName")]
        public Input<string>? InstanceName { get; set; }

        /// <summary>
        /// The IP addresses of hosts that are allowed to use the activation code. The value can be IPv4 addresses, IPv6 addresses, or CIDR blocks.
        /// </summary>
        [Input("ipAddressRange")]
        public Input<string>? IpAddressRange { get; set; }

        /// <summary>
        /// The validity period of the activation code. The activation code cannot be used to register new instances after the validity period expires. Unit: hours. Valid values: `1` to `24`. Default value: `4`.
        /// </summary>
        [Input("timeToLiveInHours")]
        public Input<int>? TimeToLiveInHours { get; set; }

        public ActivationState()
        {
        }
        public static new ActivationState Empty => new ActivationState();
    }
}
