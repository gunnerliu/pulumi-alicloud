# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['PortfolioArgs', 'Portfolio']

@pulumi.input_type
class PortfolioArgs:
    def __init__(__self__, *,
                 portfolio_name: pulumi.Input[str],
                 provider_name: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a Portfolio resource.
        :param pulumi.Input[str] portfolio_name: The name of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] provider_name: The provider name of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] description: The description of the portfolio. The value must be 1 to 128 characters in length.
        """
        PortfolioArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            portfolio_name=portfolio_name,
            provider_name=provider_name,
            description=description,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             portfolio_name: Optional[pulumi.Input[str]] = None,
             provider_name: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if portfolio_name is None and 'portfolioName' in kwargs:
            portfolio_name = kwargs['portfolioName']
        if portfolio_name is None:
            raise TypeError("Missing 'portfolio_name' argument")
        if provider_name is None and 'providerName' in kwargs:
            provider_name = kwargs['providerName']
        if provider_name is None:
            raise TypeError("Missing 'provider_name' argument")

        _setter("portfolio_name", portfolio_name)
        _setter("provider_name", provider_name)
        if description is not None:
            _setter("description", description)

    @property
    @pulumi.getter(name="portfolioName")
    def portfolio_name(self) -> pulumi.Input[str]:
        """
        The name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "portfolio_name")

    @portfolio_name.setter
    def portfolio_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "portfolio_name", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Input[str]:
        """
        The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: pulumi.Input[str]):
        pulumi.set(self, "provider_name", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)


@pulumi.input_type
class _PortfolioState:
    def __init__(__self__, *,
                 create_time: Optional[pulumi.Input[str]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 portfolio_arn: Optional[pulumi.Input[str]] = None,
                 portfolio_name: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering Portfolio resources.
        :param pulumi.Input[str] create_time: The creation time of the portfolio.
        :param pulumi.Input[str] description: The description of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] portfolio_arn: The ARN of the portfolio.
        :param pulumi.Input[str] portfolio_name: The name of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] provider_name: The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        _PortfolioState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            create_time=create_time,
            description=description,
            portfolio_arn=portfolio_arn,
            portfolio_name=portfolio_name,
            provider_name=provider_name,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             create_time: Optional[pulumi.Input[str]] = None,
             description: Optional[pulumi.Input[str]] = None,
             portfolio_arn: Optional[pulumi.Input[str]] = None,
             portfolio_name: Optional[pulumi.Input[str]] = None,
             provider_name: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions]=None,
             **kwargs):
        if create_time is None and 'createTime' in kwargs:
            create_time = kwargs['createTime']
        if portfolio_arn is None and 'portfolioArn' in kwargs:
            portfolio_arn = kwargs['portfolioArn']
        if portfolio_name is None and 'portfolioName' in kwargs:
            portfolio_name = kwargs['portfolioName']
        if provider_name is None and 'providerName' in kwargs:
            provider_name = kwargs['providerName']

        if create_time is not None:
            _setter("create_time", create_time)
        if description is not None:
            _setter("description", description)
        if portfolio_arn is not None:
            _setter("portfolio_arn", portfolio_arn)
        if portfolio_name is not None:
            _setter("portfolio_name", portfolio_name)
        if provider_name is not None:
            _setter("provider_name", provider_name)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> Optional[pulumi.Input[str]]:
        """
        The creation time of the portfolio.
        """
        return pulumi.get(self, "create_time")

    @create_time.setter
    def create_time(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "create_time", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter(name="portfolioArn")
    def portfolio_arn(self) -> Optional[pulumi.Input[str]]:
        """
        The ARN of the portfolio.
        """
        return pulumi.get(self, "portfolio_arn")

    @portfolio_arn.setter
    def portfolio_arn(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "portfolio_arn", value)

    @property
    @pulumi.getter(name="portfolioName")
    def portfolio_name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "portfolio_name")

    @portfolio_name.setter
    def portfolio_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "portfolio_name", value)

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> Optional[pulumi.Input[str]]:
        """
        The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "provider_name")

    @provider_name.setter
    def provider_name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "provider_name", value)


class Portfolio(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 portfolio_name: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Service Catalog Portfolio resource.

        For information about Service Catalog Portfolio and how to use it, see [What is Portfolio](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-createportfolio).

        > **NOTE:** Available since v1.204.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default = alicloud.servicecatalog.Portfolio("default",
            portfolio_name=name,
            provider_name=name)
        ```

        ## Import

        Service Catalog Portfolio can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:servicecatalog/portfolio:Portfolio example <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] description: The description of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] portfolio_name: The name of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] provider_name: The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: PortfolioArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Service Catalog Portfolio resource.

        For information about Service Catalog Portfolio and how to use it, see [What is Portfolio](https://www.alibabacloud.com/help/en/service-catalog/developer-reference/api-servicecatalog-2021-09-01-createportfolio).

        > **NOTE:** Available since v1.204.0+.

        ## Example Usage

        Basic Usage

        ```python
        import pulumi
        import pulumi_alicloud as alicloud

        config = pulumi.Config()
        name = config.get("name")
        if name is None:
            name = "tf_example"
        default = alicloud.servicecatalog.Portfolio("default",
            portfolio_name=name,
            provider_name=name)
        ```

        ## Import

        Service Catalog Portfolio can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:servicecatalog/portfolio:Portfolio example <id>
        ```

        :param str resource_name: The name of the resource.
        :param PortfolioArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(PortfolioArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            PortfolioArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 portfolio_name: Optional[pulumi.Input[str]] = None,
                 provider_name: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = PortfolioArgs.__new__(PortfolioArgs)

            __props__.__dict__["description"] = description
            if portfolio_name is None and not opts.urn:
                raise TypeError("Missing required property 'portfolio_name'")
            __props__.__dict__["portfolio_name"] = portfolio_name
            if provider_name is None and not opts.urn:
                raise TypeError("Missing required property 'provider_name'")
            __props__.__dict__["provider_name"] = provider_name
            __props__.__dict__["create_time"] = None
            __props__.__dict__["portfolio_arn"] = None
        super(Portfolio, __self__).__init__(
            'alicloud:servicecatalog/portfolio:Portfolio',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            create_time: Optional[pulumi.Input[str]] = None,
            description: Optional[pulumi.Input[str]] = None,
            portfolio_arn: Optional[pulumi.Input[str]] = None,
            portfolio_name: Optional[pulumi.Input[str]] = None,
            provider_name: Optional[pulumi.Input[str]] = None) -> 'Portfolio':
        """
        Get an existing Portfolio resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] create_time: The creation time of the portfolio.
        :param pulumi.Input[str] description: The description of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] portfolio_arn: The ARN of the portfolio.
        :param pulumi.Input[str] portfolio_name: The name of the portfolio. The value must be 1 to 128 characters in length.
        :param pulumi.Input[str] provider_name: The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _PortfolioState.__new__(_PortfolioState)

        __props__.__dict__["create_time"] = create_time
        __props__.__dict__["description"] = description
        __props__.__dict__["portfolio_arn"] = portfolio_arn
        __props__.__dict__["portfolio_name"] = portfolio_name
        __props__.__dict__["provider_name"] = provider_name
        return Portfolio(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="createTime")
    def create_time(self) -> pulumi.Output[str]:
        """
        The creation time of the portfolio.
        """
        return pulumi.get(self, "create_time")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter(name="portfolioArn")
    def portfolio_arn(self) -> pulumi.Output[str]:
        """
        The ARN of the portfolio.
        """
        return pulumi.get(self, "portfolio_arn")

    @property
    @pulumi.getter(name="portfolioName")
    def portfolio_name(self) -> pulumi.Output[str]:
        """
        The name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "portfolio_name")

    @property
    @pulumi.getter(name="providerName")
    def provider_name(self) -> pulumi.Output[str]:
        """
        The provider name of the portfolio. The value must be 1 to 128 characters in length.
        """
        return pulumi.get(self, "provider_name")

