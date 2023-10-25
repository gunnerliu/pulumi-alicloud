# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Callable, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['ListenerAdditionalCertificateAttachmentArgs', 'ListenerAdditionalCertificateAttachment']

@pulumi.input_type
class ListenerAdditionalCertificateAttachmentArgs:
    def __init__(__self__, *,
                 certificate_id: pulumi.Input[str],
                 listener_id: pulumi.Input[str]):
        """
        The set of arguments for constructing a ListenerAdditionalCertificateAttachment resource.
        :param pulumi.Input[str] certificate_id: The Certificate ID.
        :param pulumi.Input[str] listener_id: The ID of the ALB listener.
        """
        ListenerAdditionalCertificateAttachmentArgs._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate_id=certificate_id,
            listener_id=listener_id,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate_id: Optional[pulumi.Input[str]] = None,
             listener_id: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if certificate_id is None and 'certificateId' in kwargs:
            certificate_id = kwargs['certificateId']
        if certificate_id is None:
            raise TypeError("Missing 'certificate_id' argument")
        if listener_id is None and 'listenerId' in kwargs:
            listener_id = kwargs['listenerId']
        if listener_id is None:
            raise TypeError("Missing 'listener_id' argument")

        _setter("certificate_id", certificate_id)
        _setter("listener_id", listener_id)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Input[str]:
        """
        The Certificate ID.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> pulumi.Input[str]:
        """
        The ID of the ALB listener.
        """
        return pulumi.get(self, "listener_id")

    @listener_id.setter
    def listener_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "listener_id", value)


@pulumi.input_type
class _ListenerAdditionalCertificateAttachmentState:
    def __init__(__self__, *,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 certificate_type: Optional[pulumi.Input[str]] = None,
                 listener_id: Optional[pulumi.Input[str]] = None,
                 status: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering ListenerAdditionalCertificateAttachment resources.
        :param pulumi.Input[str] certificate_id: The Certificate ID.
        :param pulumi.Input[str] certificate_type: The type of the certificate.
        :param pulumi.Input[str] listener_id: The ID of the ALB listener.
        :param pulumi.Input[str] status: The status of the certificate.
        """
        _ListenerAdditionalCertificateAttachmentState._configure(
            lambda key, value: pulumi.set(__self__, key, value),
            certificate_id=certificate_id,
            certificate_type=certificate_type,
            listener_id=listener_id,
            status=status,
        )
    @staticmethod
    def _configure(
             _setter: Callable[[Any, Any], None],
             certificate_id: Optional[pulumi.Input[str]] = None,
             certificate_type: Optional[pulumi.Input[str]] = None,
             listener_id: Optional[pulumi.Input[str]] = None,
             status: Optional[pulumi.Input[str]] = None,
             opts: Optional[pulumi.ResourceOptions] = None,
             **kwargs):
        if certificate_id is None and 'certificateId' in kwargs:
            certificate_id = kwargs['certificateId']
        if certificate_type is None and 'certificateType' in kwargs:
            certificate_type = kwargs['certificateType']
        if listener_id is None and 'listenerId' in kwargs:
            listener_id = kwargs['listenerId']

        if certificate_id is not None:
            _setter("certificate_id", certificate_id)
        if certificate_type is not None:
            _setter("certificate_type", certificate_type)
        if listener_id is not None:
            _setter("listener_id", listener_id)
        if status is not None:
            _setter("status", status)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> Optional[pulumi.Input[str]]:
        """
        The Certificate ID.
        """
        return pulumi.get(self, "certificate_id")

    @certificate_id.setter
    def certificate_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_id", value)

    @property
    @pulumi.getter(name="certificateType")
    def certificate_type(self) -> Optional[pulumi.Input[str]]:
        """
        The type of the certificate.
        """
        return pulumi.get(self, "certificate_type")

    @certificate_type.setter
    def certificate_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "certificate_type", value)

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> Optional[pulumi.Input[str]]:
        """
        The ID of the ALB listener.
        """
        return pulumi.get(self, "listener_id")

    @listener_id.setter
    def listener_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "listener_id", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the certificate.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)


class ListenerAdditionalCertificateAttachment(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 listener_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Provides a Application Load Balancer (ALB) Listener Additional Certificate Attachment resource.

        For information about Application Load Balancer (ALB) Listener Additional Certificate Attachment and how to use it, see [What is Listener Additional Certificate Attachment](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-associateadditionalcertificateswithlistener).

        > **NOTE:** Available since v1.161.0.

        ## Import

        Application Load Balancer (ALB) Listener Additional Certificate Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment example <listener_id>:<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_id: The Certificate ID.
        :param pulumi.Input[str] listener_id: The ID of the ALB listener.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: ListenerAdditionalCertificateAttachmentArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Provides a Application Load Balancer (ALB) Listener Additional Certificate Attachment resource.

        For information about Application Load Balancer (ALB) Listener Additional Certificate Attachment and how to use it, see [What is Listener Additional Certificate Attachment](https://www.alibabacloud.com/help/en/slb/application-load-balancer/developer-reference/api-alb-2020-06-16-associateadditionalcertificateswithlistener).

        > **NOTE:** Available since v1.161.0.

        ## Import

        Application Load Balancer (ALB) Listener Additional Certificate Attachment can be imported using the id, e.g.

        ```sh
         $ pulumi import alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment example <listener_id>:<certificate_id>
        ```

        :param str resource_name: The name of the resource.
        :param ListenerAdditionalCertificateAttachmentArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(ListenerAdditionalCertificateAttachmentArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            kwargs = kwargs or {}
            def _setter(key, value):
                kwargs[key] = value
            ListenerAdditionalCertificateAttachmentArgs._configure(_setter, **kwargs)
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 certificate_id: Optional[pulumi.Input[str]] = None,
                 listener_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = ListenerAdditionalCertificateAttachmentArgs.__new__(ListenerAdditionalCertificateAttachmentArgs)

            if certificate_id is None and not opts.urn:
                raise TypeError("Missing required property 'certificate_id'")
            __props__.__dict__["certificate_id"] = certificate_id
            if listener_id is None and not opts.urn:
                raise TypeError("Missing required property 'listener_id'")
            __props__.__dict__["listener_id"] = listener_id
            __props__.__dict__["certificate_type"] = None
            __props__.__dict__["status"] = None
        super(ListenerAdditionalCertificateAttachment, __self__).__init__(
            'alicloud:alb/listenerAdditionalCertificateAttachment:ListenerAdditionalCertificateAttachment',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            certificate_id: Optional[pulumi.Input[str]] = None,
            certificate_type: Optional[pulumi.Input[str]] = None,
            listener_id: Optional[pulumi.Input[str]] = None,
            status: Optional[pulumi.Input[str]] = None) -> 'ListenerAdditionalCertificateAttachment':
        """
        Get an existing ListenerAdditionalCertificateAttachment resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] certificate_id: The Certificate ID.
        :param pulumi.Input[str] certificate_type: The type of the certificate.
        :param pulumi.Input[str] listener_id: The ID of the ALB listener.
        :param pulumi.Input[str] status: The status of the certificate.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _ListenerAdditionalCertificateAttachmentState.__new__(_ListenerAdditionalCertificateAttachmentState)

        __props__.__dict__["certificate_id"] = certificate_id
        __props__.__dict__["certificate_type"] = certificate_type
        __props__.__dict__["listener_id"] = listener_id
        __props__.__dict__["status"] = status
        return ListenerAdditionalCertificateAttachment(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="certificateId")
    def certificate_id(self) -> pulumi.Output[str]:
        """
        The Certificate ID.
        """
        return pulumi.get(self, "certificate_id")

    @property
    @pulumi.getter(name="certificateType")
    def certificate_type(self) -> pulumi.Output[str]:
        """
        The type of the certificate.
        """
        return pulumi.get(self, "certificate_type")

    @property
    @pulumi.getter(name="listenerId")
    def listener_id(self) -> pulumi.Output[str]:
        """
        The ID of the ALB listener.
        """
        return pulumi.get(self, "listener_id")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the certificate.
        """
        return pulumi.get(self, "status")

