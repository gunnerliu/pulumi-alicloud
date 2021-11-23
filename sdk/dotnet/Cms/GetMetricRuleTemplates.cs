// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi.Utilities;

namespace Pulumi.AliCloud.Cms
{
    public static class GetMetricRuleTemplates
    {
        /// <summary>
        /// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var ids = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.CmsMetricRuleTemplateId1 = ids.Apply(ids =&gt; ids.Templates?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             NameRegex = "^my-MetricRuleTemplate",
        ///         }));
        ///         this.CmsMetricRuleTemplateId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///         var keyword = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             Keyword = "^my-MetricRuleTemplate",
        ///         }));
        ///         this.CmsMetricRuleTemplateId3 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///         var templateId = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             TemplateId = "example_value",
        ///         }));
        ///         this.CmsMetricRuleTemplateId4 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cmsMetricRuleTemplateId1")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId1 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId2")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId2 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId3")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId3 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId4")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMetricRuleTemplatesResult> InvokeAsync(GetMetricRuleTemplatesArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMetricRuleTemplatesResult>("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args ?? new GetMetricRuleTemplatesArgs(), options.WithVersion());

        /// <summary>
        /// This data source provides the Cms Metric Rule Templates of the current Alibaba Cloud user.
        /// 
        /// &gt; **NOTE:** Available in v1.134.0+.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
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
        ///         var ids = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             Ids = 
        ///             {
        ///                 "example_value",
        ///             },
        ///         }));
        ///         this.CmsMetricRuleTemplateId1 = ids.Apply(ids =&gt; ids.Templates?[0]?.Id);
        ///         var nameRegex = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             NameRegex = "^my-MetricRuleTemplate",
        ///         }));
        ///         this.CmsMetricRuleTemplateId2 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///         var keyword = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             Keyword = "^my-MetricRuleTemplate",
        ///         }));
        ///         this.CmsMetricRuleTemplateId3 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///         var templateId = Output.Create(AliCloud.Cms.GetMetricRuleTemplates.InvokeAsync(new AliCloud.Cms.GetMetricRuleTemplatesArgs
        ///         {
        ///             TemplateId = "example_value",
        ///         }));
        ///         this.CmsMetricRuleTemplateId4 = nameRegex.Apply(nameRegex =&gt; nameRegex.Templates?[0]?.Id);
        ///     }
        /// 
        ///     [Output("cmsMetricRuleTemplateId1")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId1 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId2")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId2 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId3")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId3 { get; set; }
        ///     [Output("cmsMetricRuleTemplateId4")]
        ///     public Output&lt;string&gt; CmsMetricRuleTemplateId4 { get; set; }
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetMetricRuleTemplatesResult> Invoke(GetMetricRuleTemplatesInvokeArgs? args = null, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.Invoke<GetMetricRuleTemplatesResult>("alicloud:cms/getMetricRuleTemplates:getMetricRuleTemplates", args ?? new GetMetricRuleTemplatesInvokeArgs(), options.WithVersion());
    }


    public sealed class GetMetricRuleTemplatesArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public bool? EnableDetails { get; set; }

        [Input("ids")]
        private List<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Template IDs.
        /// </summary>
        public List<string> Ids
        {
            get => _ids ?? (_ids = new List<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the alert template. You can perform fuzzy search based on the template name.
        /// </summary>
        [Input("keyword")]
        public string? Keyword { get; set; }

        /// <summary>
        /// The name of the alert template.
        /// </summary>
        [Input("metricRuleTemplateName")]
        public string? MetricRuleTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Metric Rule Template name.
        /// </summary>
        [Input("nameRegex")]
        public string? NameRegex { get; set; }

        [Input("outputFile")]
        public string? OutputFile { get; set; }

        /// <summary>
        /// The ID of the alert template.
        /// </summary>
        [Input("templateId")]
        public string? TemplateId { get; set; }

        public GetMetricRuleTemplatesArgs()
        {
        }
    }

    public sealed class GetMetricRuleTemplatesInvokeArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// Valid values: `true` or `false`. Default to `false`. Set it to `true` can output more details about resource attributes.
        /// </summary>
        [Input("enableDetails")]
        public Input<bool>? EnableDetails { get; set; }

        [Input("ids")]
        private InputList<string>? _ids;

        /// <summary>
        /// A list of Metric Rule Template IDs.
        /// </summary>
        public InputList<string> Ids
        {
            get => _ids ?? (_ids = new InputList<string>());
            set => _ids = value;
        }

        /// <summary>
        /// The name of the alert template. You can perform fuzzy search based on the template name.
        /// </summary>
        [Input("keyword")]
        public Input<string>? Keyword { get; set; }

        /// <summary>
        /// The name of the alert template.
        /// </summary>
        [Input("metricRuleTemplateName")]
        public Input<string>? MetricRuleTemplateName { get; set; }

        /// <summary>
        /// A regex string to filter results by Metric Rule Template name.
        /// </summary>
        [Input("nameRegex")]
        public Input<string>? NameRegex { get; set; }

        [Input("outputFile")]
        public Input<string>? OutputFile { get; set; }

        /// <summary>
        /// The ID of the alert template.
        /// </summary>
        [Input("templateId")]
        public Input<string>? TemplateId { get; set; }

        public GetMetricRuleTemplatesInvokeArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetMetricRuleTemplatesResult
    {
        public readonly bool? EnableDetails;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly ImmutableArray<string> Ids;
        public readonly string? Keyword;
        public readonly string? MetricRuleTemplateName;
        public readonly string? NameRegex;
        public readonly ImmutableArray<string> Names;
        public readonly string? OutputFile;
        public readonly string? TemplateId;
        public readonly ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateResult> Templates;

        [OutputConstructor]
        private GetMetricRuleTemplatesResult(
            bool? enableDetails,

            string id,

            ImmutableArray<string> ids,

            string? keyword,

            string? metricRuleTemplateName,

            string? nameRegex,

            ImmutableArray<string> names,

            string? outputFile,

            string? templateId,

            ImmutableArray<Outputs.GetMetricRuleTemplatesTemplateResult> templates)
        {
            EnableDetails = enableDetails;
            Id = id;
            Ids = ids;
            Keyword = keyword;
            MetricRuleTemplateName = metricRuleTemplateName;
            NameRegex = nameRegex;
            Names = names;
            OutputFile = outputFile;
            TemplateId = templateId;
            Templates = templates;
        }
    }
}