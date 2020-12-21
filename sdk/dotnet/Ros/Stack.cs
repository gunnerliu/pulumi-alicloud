// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.AliCloud.Ros
{
    /// <summary>
    /// Provides a ROS Stack resource.
    /// 
    /// For information about ROS Stack and how to use it, see [What is Stack](https://www.alibabacloud.com/help/en/doc-detail/132086.htm).
    /// 
    /// &gt; **NOTE:** Available in v1.106.0+.
    /// 
    /// ## Example Usage
    /// 
    /// Basic Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using AliCloud = Pulumi.AliCloud;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var example = new AliCloud.Ros.Stack("example", new AliCloud.Ros.StackArgs
    ///         {
    ///             StackName = "tf-testaccstack",
    ///             StackPolicyBody = @"    {
    ///     	""Statement"": [{
    ///     		""Action"": ""Update:Delete"",
    ///     		""Resource"": ""*"",
    ///     		""Effect"": ""Allow"",
    ///     		""Principal"": ""*""
    ///     	}]
    ///     }
    ///     
    /// ",
    ///             TemplateBody = @"    {
    ///     	""ROSTemplateFormatVersion"": ""2015-09-01""
    ///     }
    ///     
    /// ",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// ROS Stack can be imported using the id, e.g.
    /// 
    /// ```sh
    ///  $ pulumi import alicloud:ros/stack:Stack example &lt;stack_id&gt;
    /// ```
    /// </summary>
    public partial class Stack : Pulumi.CustomResource
    {
        /// <summary>
        /// Specifies whether to delete the stack after it is created.
        /// </summary>
        [Output("createOption")]
        public Output<string?> CreateOption { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
        /// </summary>
        [Output("deletionProtection")]
        public Output<string?> DeletionProtection { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
        /// </summary>
        [Output("disableRollback")]
        public Output<bool?> DisableRollback { get; private set; } = null!;

        /// <summary>
        /// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
        /// </summary>
        [Output("notificationUrls")]
        public Output<ImmutableArray<string>> NotificationUrls { get; private set; } = null!;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        [Output("parameters")]
        public Output<ImmutableArray<Outputs.StackParameter>> Parameters { get; private set; } = null!;

        /// <summary>
        /// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
        /// </summary>
        [Output("ramRoleName")]
        public Output<string?> RamRoleName { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
        /// </summary>
        [Output("replacementOption")]
        public Output<string?> ReplacementOption { get; private set; } = null!;

        /// <summary>
        /// The retain all resources.
        /// </summary>
        [Output("retainAllResources")]
        public Output<bool?> RetainAllResources { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to retain the resources in the stack.
        /// </summary>
        [Output("retainResources")]
        public Output<ImmutableArray<string>> RetainResources { get; private set; } = null!;

        /// <summary>
        /// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        /// </summary>
        [Output("stackName")]
        public Output<string> StackName { get; private set; } = null!;

        /// <summary>
        /// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Output("stackPolicyBody")]
        public Output<string?> StackPolicyBody { get; private set; } = null!;

        /// <summary>
        /// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Output("stackPolicyDuringUpdateBody")]
        public Output<string?> StackPolicyDuringUpdateBody { get; private set; } = null!;

        /// <summary>
        /// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Output("stackPolicyDuringUpdateUrl")]
        public Output<string?> StackPolicyDuringUpdateUrl { get; private set; } = null!;

        /// <summary>
        /// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Output("stackPolicyUrl")]
        public Output<string?> StackPolicyUrl { get; private set; } = null!;

        /// <summary>
        /// The status of Stack.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// A mapping of tags to assign to the resource.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, object>?> Tags { get; private set; } = null!;

        /// <summary>
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Output("templateBody")]
        public Output<string?> TemplateBody { get; private set; } = null!;

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Output("templateUrl")]
        public Output<string?> TemplateUrl { get; private set; } = null!;

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Output("templateVersion")]
        public Output<string?> TemplateVersion { get; private set; } = null!;

        /// <summary>
        /// The timeout period that is specified for the stack creation request. Default to: `60`.
        /// </summary>
        [Output("timeoutInMinutes")]
        public Output<int?> TimeoutInMinutes { get; private set; } = null!;

        /// <summary>
        /// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
        /// </summary>
        [Output("usePreviousParameters")]
        public Output<bool?> UsePreviousParameters { get; private set; } = null!;


        /// <summary>
        /// Create a Stack resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Stack(string name, StackArgs args, CustomResourceOptions? options = null)
            : base("alicloud:ros/stack:Stack", name, args ?? new StackArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Stack(string name, Input<string> id, StackState? state = null, CustomResourceOptions? options = null)
            : base("alicloud:ros/stack:Stack", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Stack resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Stack Get(string name, Input<string> id, StackState? state = null, CustomResourceOptions? options = null)
        {
            return new Stack(name, id, state, options);
        }
    }

    public sealed class StackArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to delete the stack after it is created.
        /// </summary>
        [Input("createOption")]
        public Input<string>? CreateOption { get; set; }

        /// <summary>
        /// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
        /// </summary>
        [Input("deletionProtection")]
        public Input<string>? DeletionProtection { get; set; }

        /// <summary>
        /// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
        /// </summary>
        [Input("disableRollback")]
        public Input<bool>? DisableRollback { get; set; }

        [Input("notificationUrls")]
        private InputList<string>? _notificationUrls;

        /// <summary>
        /// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
        /// </summary>
        public InputList<string> NotificationUrls
        {
            get => _notificationUrls ?? (_notificationUrls = new InputList<string>());
            set => _notificationUrls = value;
        }

        [Input("parameters")]
        private InputList<Inputs.StackParameterArgs>? _parameters;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        public InputList<Inputs.StackParameterArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.StackParameterArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
        /// </summary>
        [Input("ramRoleName")]
        public Input<string>? RamRoleName { get; set; }

        /// <summary>
        /// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
        /// </summary>
        [Input("replacementOption")]
        public Input<string>? ReplacementOption { get; set; }

        /// <summary>
        /// The retain all resources.
        /// </summary>
        [Input("retainAllResources")]
        public Input<bool>? RetainAllResources { get; set; }

        [Input("retainResources")]
        private InputList<string>? _retainResources;

        /// <summary>
        /// Specifies whether to retain the resources in the stack.
        /// </summary>
        public InputList<string> RetainResources
        {
            get => _retainResources ?? (_retainResources = new InputList<string>());
            set => _retainResources = value;
        }

        /// <summary>
        /// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        /// </summary>
        [Input("stackName", required: true)]
        public Input<string> StackName { get; set; } = null!;

        /// <summary>
        /// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Input("stackPolicyBody")]
        public Input<string>? StackPolicyBody { get; set; }

        /// <summary>
        /// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Input("stackPolicyDuringUpdateBody")]
        public Input<string>? StackPolicyDuringUpdateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("stackPolicyDuringUpdateUrl")]
        public Input<string>? StackPolicyDuringUpdateUrl { get; set; }

        /// <summary>
        /// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("stackPolicyUrl")]
        public Input<string>? StackPolicyUrl { get; set; }

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
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("templateUrl")]
        public Input<string>? TemplateUrl { get; set; }

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        /// <summary>
        /// The timeout period that is specified for the stack creation request. Default to: `60`.
        /// </summary>
        [Input("timeoutInMinutes")]
        public Input<int>? TimeoutInMinutes { get; set; }

        /// <summary>
        /// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
        /// </summary>
        [Input("usePreviousParameters")]
        public Input<bool>? UsePreviousParameters { get; set; }

        public StackArgs()
        {
        }
    }

    public sealed class StackState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies whether to delete the stack after it is created.
        /// </summary>
        [Input("createOption")]
        public Input<string>? CreateOption { get; set; }

        /// <summary>
        /// Specifies whether to enable deletion protection on the stack. Valid values: `Disabled`, `Enabled`. Default to: `Disabled`
        /// </summary>
        [Input("deletionProtection")]
        public Input<string>? DeletionProtection { get; set; }

        /// <summary>
        /// Specifies whether to disable rollback on stack creation failure. Default to: `false`.
        /// </summary>
        [Input("disableRollback")]
        public Input<bool>? DisableRollback { get; set; }

        [Input("notificationUrls")]
        private InputList<string>? _notificationUrls;

        /// <summary>
        /// The callback URL for receiving stack event N. Only HTTP POST is supported. Maximum value of N: 5.
        /// </summary>
        public InputList<string> NotificationUrls
        {
            get => _notificationUrls ?? (_notificationUrls = new InputList<string>());
            set => _notificationUrls = value;
        }

        [Input("parameters")]
        private InputList<Inputs.StackParameterGetArgs>? _parameters;

        /// <summary>
        /// The parameters. If the parameter name and value are not specified, ROS will use the default value specified in the template.
        /// </summary>
        public InputList<Inputs.StackParameterGetArgs> Parameters
        {
            get => _parameters ?? (_parameters = new InputList<Inputs.StackParameterGetArgs>());
            set => _parameters = value;
        }

        /// <summary>
        /// The name of the RAM role. ROS assumes the specified RAM role to create the stack and call API operations by using the credentials of the role.
        /// </summary>
        [Input("ramRoleName")]
        public Input<string>? RamRoleName { get; set; }

        /// <summary>
        /// Specifies whether to enable replacement update after a resource attribute that does not support modification update is changed. Modification update keeps the physical ID of the resource unchanged. However, the resource is deleted and then recreated, and its physical ID is changed if replacement update is enabled.
        /// </summary>
        [Input("replacementOption")]
        public Input<string>? ReplacementOption { get; set; }

        /// <summary>
        /// The retain all resources.
        /// </summary>
        [Input("retainAllResources")]
        public Input<bool>? RetainAllResources { get; set; }

        [Input("retainResources")]
        private InputList<string>? _retainResources;

        /// <summary>
        /// Specifies whether to retain the resources in the stack.
        /// </summary>
        public InputList<string> RetainResources
        {
            get => _retainResources ?? (_retainResources = new InputList<string>());
            set => _retainResources = value;
        }

        /// <summary>
        /// The name can be up to 255 characters in length and can contain digits, letters, hyphens (-), and underscores (_). It must start with a digit or letter.
        /// </summary>
        [Input("stackName")]
        public Input<string>? StackName { get; set; }

        /// <summary>
        /// The structure that contains the stack policy body. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Input("stackPolicyBody")]
        public Input<string>? StackPolicyBody { get; set; }

        /// <summary>
        /// The structure that contains the body of the temporary overriding stack policy. The stack policy body must be 1 to 16,384 bytes in length.
        /// </summary>
        [Input("stackPolicyDuringUpdateBody")]
        public Input<string>? StackPolicyDuringUpdateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the temporary overriding stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("stackPolicyDuringUpdateUrl")]
        public Input<string>? StackPolicyDuringUpdateUrl { get; set; }

        /// <summary>
        /// The URL of the file that contains the stack policy. The URL must point to a policy located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The policy can be up to 16,384 bytes in length and the URL can be up to 1,350 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("stackPolicyUrl")]
        public Input<string>? StackPolicyUrl { get; set; }

        /// <summary>
        /// The status of Stack.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

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
        /// The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body is longer than required, we recommend that you add parameters to the HTTP POST request body to avoid request failures due to excessive length of URLs.
        /// </summary>
        [Input("templateBody")]
        public Input<string>? TemplateBody { get; set; }

        /// <summary>
        /// The URL of the file that contains the template body. The URL must point to a template located in an HTTP or HTTPS web server or an Alibaba Cloud OSS bucket. Examples: oss://ros/template/demo and oss://ros/template/demo?RegionId=cn-hangzhou. The template must be 1 to 524,288 bytes in length. If the region of the OSS bucket is not specified, the RegionId value is used by default.
        /// </summary>
        [Input("templateUrl")]
        public Input<string>? TemplateUrl { get; set; }

        /// <summary>
        /// The version of the template.
        /// </summary>
        [Input("templateVersion")]
        public Input<string>? TemplateVersion { get; set; }

        /// <summary>
        /// The timeout period that is specified for the stack creation request. Default to: `60`.
        /// </summary>
        [Input("timeoutInMinutes")]
        public Input<int>? TimeoutInMinutes { get; set; }

        /// <summary>
        /// Specifies whether to use the values that were passed last time for the parameters that you do not specify in the current request.
        /// </summary>
        [Input("usePreviousParameters")]
        public Input<bool>? UsePreviousParameters { get; set; }

        public StackState()
        {
        }
    }
}