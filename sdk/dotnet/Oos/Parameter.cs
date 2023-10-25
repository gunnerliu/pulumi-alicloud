// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Oos
{
    /// <summary>
    /// Provides a OOS Parameter resource.
    /// 
    /// For information about OOS Parameter and how to use it, see [What is Parameter](https://www.alibabacloud.com/help/en/doc-detail/183408.html).
    /// 
    /// &gt; **NOTE:** Available in v1.147.0+.
    /// 
    /// ## Import
    /// 
    /// OOS Parameter can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:oos/parameter:Parameter example &lt;parameter_name&gt;
    /// ```
    /// </summary>
    [AliCloudResourceType("alicloud:oos/parameter:Parameter")]
    public partial class Parameter : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The constraints of the common parameter. This value follows the json format. By default, this parameter is null. Valid values:
        /// </summary>
        [Output("constraints")]
        public Output<string?> Constraints { get; private set; } = null!;

        /// <summary>
        /// The description of the common parameter. The description must be `1` to `200` characters in length.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The name of the common parameter. The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        /// </summary>
        [Output("parameterName")]
        public Output<string> ParameterName { get; private set; } = null!;

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Output("resourceGroupId")]
        public Output<string> ResourceGroupId { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The data type of the common parameter. Valid values: `String` and `StringList`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;

        /// <summary>
        /// The value of the common parameter. The value must be `1` to `4096` characters in length.
        /// </summary>
        [Output("value")]
        public Output<string> Value { get; private set; } = null!;


        /// <summary>
        /// Create a Parameter resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Parameter(string name, ParameterArgs args, CustomResourceOptions? options = null)
            : base("alicloud:oos/parameter:Parameter", name, args ?? new ParameterArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Parameter(string name, Input<string> id, ParameterState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:oos/parameter:Parameter", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Parameter resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Parameter Get(string name, Input<string> id, ParameterState? state = null, CustomResourceOptions? options = null)
        {
            return new Parameter(name, id, state, options);
        }
    }

    public sealed class ParameterArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The constraints of the common parameter. This value follows the json format. By default, this parameter is null. Valid values:
        /// </summary>
        [Input("constraints")]
        public Input<string>? Constraints { get; set; }

        /// <summary>
        /// The description of the common parameter. The description must be `1` to `200` characters in length.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the common parameter. The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        /// </summary>
        [Input("parameterName", required: true)]
        public Input<string> ParameterName { get; set; } = null!;

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The data type of the common parameter. Valid values: `String` and `StringList`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// The value of the common parameter. The value must be `1` to `4096` characters in length.
        /// </summary>
        [Input("value", required: true)]
        public Input<string> Value { get; set; } = null!;

        public ParameterArgs()
        {
        }
        public static new ParameterArgs Empty => new ParameterArgs();
    }

    public sealed class ParameterState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The constraints of the common parameter. This value follows the json format. By default, this parameter is null. Valid values:
        /// </summary>
        [Input("constraints")]
        public Input<string>? Constraints { get; set; }

        /// <summary>
        /// The description of the common parameter. The description must be `1` to `200` characters in length.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The name of the common parameter. The name must be `2` to `180` characters in length, and can contain letters, digits, hyphens (-), forward slashes (/) and underscores (_). It cannot start with `ALIYUN`, `ACS`, `ALIBABA`, `ALICLOUD`, or `OOS`.
        /// </summary>
        [Input("parameterName")]
        public Input<string>? ParameterName { get; set; }

        /// <summary>
        /// The ID of the Resource Group.
        /// </summary>
        [Input("resourceGroupId")]
        public Input<string>? ResourceGroupId { get; set; }

        [Input("tags")]
        private InputMap<object>? _tags;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        public InputMap<object> Tags
        {
            get => _tags ?? (_tags = new InputMap<object>());
            set => _tags = value;
        }

        /// <summary>
        /// The data type of the common parameter. Valid values: `String` and `StringList`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// The value of the common parameter. The value must be `1` to `4096` characters in length.
        /// </summary>
        [Input("value")]
        public Input<string>? Value { get; set; }

        public ParameterState()
        {
        }
        public static new ParameterState Empty => new ParameterState();
    }
}
